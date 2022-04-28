package qr.program.moyuban.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author qr
 * @date 2022/4/28 12:23
 */
@Configuration
@Getter
@Setter
public class RollApiConfig {

    @Value("${roll.api.app_id}")
    private String appId;
    @Value("${roll.api.app_secret}")
    private String appSecret;
}
