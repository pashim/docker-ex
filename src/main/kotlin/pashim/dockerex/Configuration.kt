package pashim.dockerex

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


@EnableAutoConfiguration
@EnableWebMvc
class Configuration: WebMvcConfigurer
