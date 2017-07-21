package services.recommendationresult;

import data.repository.RecommendedVideosRepository;
import data.repository.StaffRepository;
import models.apimodel.BecauseYouWatch;
import models.apimodel.RecommendationViewModel;
import models.apimodel.RecommendedVideos;
import models.apimodel.VideoScore;
import models.resources.Constants;
import services.primitives.BaseService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by christachiquita on 21/07/2017.
 */
public class BecauseYouWatchedService extends BaseService {

    private static StaffRepository                 _staffRepository;
    private static RecommendedVideosRepository     _recommendationRepository;

    public BecauseYouWatchedService(StaffRepository staffRepository, RecommendedVideosRepository recommendedVideoRepository){
        this._staffRepository                 = staffRepository;
        this._recommendationRepository        = recommendedVideoRepository;
    }

    public RecommendationViewModel getRecommendations(String username){
        debugLog("Start Recommendation Service for " + username);
        try{
            List<RecommendedVideos> becauseYouWatchedRecommendation = _recommendationRepository
                    .getAllWatchedVideoTrackingCodesNew(username, false).stream().distinct().collect(Collectors.toList());

            List<BecauseYouWatch> becauseYouwatchRecommendation = this
                    .getBecauseYouWatchedRecommendation(username, becauseYouWatchedRecommendation);

            return new RecommendationViewModel(becauseYouwatchRecommendation);
        }
        catch (Exception e){
            return new RecommendationViewModel(Collections.emptyList());
        }
    }

    private List<BecauseYouWatch> getBecauseYouWatchedRecommendation(String username, List<RecommendedVideos> recommendation)
    {
        List<BecauseYouWatch> result = new ArrayList<>();

        List<String> watchedTrackingCodes = recommendation.stream()
                .map(i -> i.watchedVideoTrackingCode)
                .distinct()
                .collect(Collectors.toList());

        watchedTrackingCodes.stream().forEach(trackingCode -> {
            int max = Constants.MAX_NUM_OF_RECOMMENDATION;
            List<VideoScore> finalRecommendation = recommendation.stream()
                    .filter(video -> video.watchedVideoTrackingCode.equals(trackingCode))
                    .limit(max)
                    .collect(Collectors.toList());

            result.add(new BecauseYouWatch(trackingCode, finalRecommendation));
        });

        return result;
    }
}
