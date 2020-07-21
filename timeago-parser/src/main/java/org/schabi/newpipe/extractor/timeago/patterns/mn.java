/**/// DO NOT MODIFY THIS FILE MANUALLY
/**/// This class was automatically generated by "GeneratePatternClasses.java",
/**/// modify the "unique_patterns.json" and re-generate instead.

package org.schabi.newpipe.extractor.timeago.patterns;

import org.schabi.newpipe.extractor.timeago.PatternsHolder;

public class mn extends PatternsHolder {
    private static final String WORD_SEPARATOR = " ";
    private static final String[]
            SECONDS  /**/ = {"секундын"},
            MINUTES  /**/ = {"минутын"},
            HOURS    /**/ = {"цагийн"},
            DAYS     /**/ = {"өдрийн"},
            WEEKS    /**/ = {"долоо", "хоногийн"},
            MONTHS   /**/ = {"сарын"},
            YEARS    /**/ = {"жилийн"};

    private static final mn INSTANCE = new mn();

    public static mn getInstance() {
        return INSTANCE;
    }

    private mn() {
        super(WORD_SEPARATOR, SECONDS, MINUTES, HOURS, DAYS, WEEKS, MONTHS, YEARS);
    }
}