package services.process;

import data.repository.WatchHistoryRepository;
import models.data.VideoUserPair;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by chris on 22/07/2017.
 */
public class RecentWatchService {

    private static WatchHistoryRepository watchHistoryRepository;

    public RecentWatchService(WatchHistoryRepository watchHistoryRepository){
        this.watchHistoryRepository = watchHistoryRepository;
    }

    public List<VideoUserPair> getRecentHistory(String username){
        return watchHistoryRepository.getVideosByUsername(username)
                .stream()
                .collect(Collectors.groupingBy(user -> user.getVideoId()))
                .getOrDefault(0, Collections.EMPTY_LIST);
    }
}
