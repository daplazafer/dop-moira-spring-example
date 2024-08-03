package com.dpf.example.dop;

import com.dpf.moira.Moira;
import com.dpf.moira.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;

@Configuration
public class MoiraConfig {

    @Bean
    @Autowired
    public Moira createMoira(Collection<Node<?, ?>> nodes){
        return new Moira(nodes);
    }

}
