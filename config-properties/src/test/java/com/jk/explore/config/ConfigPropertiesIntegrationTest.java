package com.jk.explore.config;


import com.jk.explore.CamelCaseConfigurationPropertiesPrefixDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CamelCaseConfigurationPropertiesPrefixDemoApplication.class)
@TestPropertySource("classpath:custom-configuration.properties")
public class ConfigPropertiesIntegrationTest {

    @Autowired
    private BasicDatasourceConfigProperties properties;

    @Test
    public void whenSimplePropertyQueriedthenReturnsProperty() throws Exception {
        assertEquals("host-xyz.com", properties.getDbServer());

        assertEquals(5432, properties.getPort());
        assertEquals(5, properties.getMaxIdle());
        assertEquals(1, properties.getMinIdle());
        assertEquals("oracleJndi", properties.getJndiName());

        assertEquals("oracleDatasourceDomain1", properties.getAliases().get(0));
        assertEquals("oracleDatasourceDomain2", properties.getAliases().get(1));

        assertEquals("1000", properties.getAdditionalProperties().get("connectionTimeout"));
        assertEquals("2000", properties.getAdditionalProperties().get("socketTimeout"));

        assertEquals("hello", properties.getCredentials().getUsername());
        assertEquals("findme", properties.getCredentials().getPassword());
    }


}
