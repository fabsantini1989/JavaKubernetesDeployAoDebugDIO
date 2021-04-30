package com.fabsantini.java.kubernetes.config;

import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import io.micrometer.core.instrument.MeterRegistry;

public class MetricsConfig {

    @Bean
    // Classe MeterRegistryCustomizer <T> com instancia metricsCommonTags;
    MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
        // retorna uma Lambda para uso do registry, usando os métodos config e commonTags;
        return registry -> registry.config().commonTags("application", "K8S-DEMO");
    }

}
