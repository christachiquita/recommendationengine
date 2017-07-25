package services.recommendation;

import data.repository.RecommendedVideosRepository;
import interfaces.services.RecommendationEngineService;
import models.apimodel.RecommendedVideos;
import models.data.VideoByUser;
import models.data.VideoUserPair;
import models.data.recommendation.ScoredRecommendedVideo;
import models.resources.Constants;
import services.filtering.HybridFilteringService;
import services.primitives.BaseService;
import services.process.RecentWatchService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by christachiquita on 22/07/2017.
 */
public class RecommendationEngineServiceImpl extends BaseService implements RecommendationEngineService {
    /* TODO implement DI */
    private static RecentWatchService          recentWatchService;
    private static HybridFilteringService      hybridFilteringService;
    private static RecommendedVideosRepository recommendedVideoRepository;

    public RecommendationEngineServiceImpl(RecentWatchService recentWatchService, HybridFilteringService hybridFilteringService,
                                       RecommendedVideosRepository recommendationRepository){
        this.recentWatchService         = recentWatchService;
        this.hybridFilteringService     = hybridFilteringService;
        this.recommendedVideoRepository = recommendedVideoRepository;
    }

    public void updateRecommendation(String username, int count){
        List<RecommendedVideos> watchedVideos = recommendedVideoRepository.getAllWatchedVideoTrackingCodesNew(username, true);

        if (watchedVideos.isEmpty()){
            List<VideoUserPair> recentVideos = recentWatchService.getRecentHistory(username);

            if (recentVideos.isEmpty()) return;

            int index = 0;

            for (int i = 0; i < recentVideos.size(); i++){
                if (index == Constants.NUM_OF_RECENT_WATCH){
                    break;
                }

                VideoUserPair recentVideo = recentVideos.get(i);

                VideoByUser targetVideo = new VideoByUser(recentVideo.getId(),
                        recentVideo.getUsername(), recentVideo.getVideoId(),
                        new ArrayList<ScoredRecommendedVideo>());

                /* TODO : continue here*/
            }
        }
    }
}
