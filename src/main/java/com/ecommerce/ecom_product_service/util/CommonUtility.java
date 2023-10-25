package com.ecommerce.ecom_product_service.util;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import org.springframework.http.HttpHeaders;

public class CommonUtility {
	
	/**
	 * Extract various components (year, month, day, hour, minute, second, and nanosecond)
     * from the Timestamp and use them to create an OffsetDateTime.
	 * @param ts
	 * @return
	 */
	public static OffsetDateTime asOffsetDateTime(Timestamp ts){
        if (ts != null){
            return OffsetDateTime.of(ts.toLocalDateTime().getYear(), ts.toLocalDateTime().getMonthValue(),
                    ts.toLocalDateTime().getDayOfMonth(), ts.toLocalDateTime().getHour(), ts.toLocalDateTime().getMinute(),
                    ts.toLocalDateTime().getSecond(), ts.toLocalDateTime().getNano(), ZoneOffset.UTC);
        } else {
            return null;
        }
    }
	
	/**
	 * Converts the offsetDateTime to local Timestamp taking the offset into account
	 * @param offsetDateTime
	 * @return
	 */
	public static Timestamp asTimestamp(OffsetDateTime offsetDateTime) {
	    if (offsetDateTime != null) {
	        return Timestamp.from(offsetDateTime.toInstant());
	    } else {
	        return null;
	    }
	}
	
	/**
	 * Getting the required HTTP headers
	 * 
	 * @return HttpHeaders contains header information
	 */
	public static HttpHeaders getHttpHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		return headers;
	}

}
