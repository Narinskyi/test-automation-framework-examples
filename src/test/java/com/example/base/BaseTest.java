package com.example.base;

import com.example.config.TestConfig;
import com.onarinskyi.context.AbstractTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = TestConfig.class)
public abstract class BaseTest extends AbstractTest{
}
