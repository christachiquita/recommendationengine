package models.resources;

/**
 * Created by christachiquita on 21/07/2017.
 */
public final class Constants {
    public static final double PROMOTION_VIDEOS_PERCENTAGE     = 0.66;
    public static final int    NUM_OF_RECENT_WATCH             = 5;
    public static final int    MAX_OF_PREFERENCE_PER_CATEGORY  = 30;
    public static final int    MIN_OF_PREFERENCE_PER_CATEGORY  = 5;
    public static final int    MAX_NUM_OF_RECOMMENDATION       = 10;

    public static class RecomendationWeights
    {
        public static final double CURRICULUM_WEIGHT           = 0.2;
        public static final double USER_SIMILARITY_WEIGHT      = 0.35;
        public static final double CATEGORY_WEIGHT             = 0.35;
        public static final double VIDEO_SIMILARITY_WEIGHT     = 0.35;
        public static final double CATEGORY_RELATED_WEIGHT     = 0.3;
        public static final double TITLE_SIMILARITY_WEIGHT     = 0.5;
    }

    public static final String[] REGIONS = { "AU", "UK"};

    public static final String[] POPULAR_CATEGORIES    = { "english", "featurefilms", "history", "science", "health", "geography" };
    public static final String[] POPULAR_CATEGORIES_UK = { "english", "featurefilms", "history", "science", "health", "geography" };

    public static boolean isBackUpDone = true;
}
