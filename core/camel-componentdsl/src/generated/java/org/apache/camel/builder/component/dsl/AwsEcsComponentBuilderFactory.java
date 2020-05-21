/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws.ecs.ECSComponent;

/**
 * Manage AWS ECS cluster instances.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AwsEcsComponentBuilderFactory {

    /**
     * AWS Elastic Container Service (ECS) (camel-aws-ecs)
     * Manage AWS ECS cluster instances.
     * 
     * Category: cloud,management
     * Since: 3.0
     * Maven coordinates: org.apache.camel:camel-aws-ecs
     */
    static AwsEcsComponentBuilder awsEcs() {
        return new AwsEcsComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Elastic Container Service (ECS) component.
     */
    interface AwsEcsComponentBuilder extends ComponentBuilder<ECSComponent> {
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsEcsComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * The component configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.ecs.ECSConfiguration</code>
         * type.
         * 
         * Group: producer
         */
        default AwsEcsComponentBuilder configuration(
                org.apache.camel.component.aws.ecs.ECSConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * To use a existing configured AWS ECS as client.
         * 
         * The option is a: <code>com.amazonaws.services.ecs.AmazonECS</code>
         * type.
         * 
         * Group: producer
         */
        default AwsEcsComponentBuilder ecsClient(
                com.amazonaws.services.ecs.AmazonECS ecsClient) {
            doSetProperty("ecsClient", ecsClient);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default AwsEcsComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.ecs.ECSOperations</code> type.
         * 
         * Group: producer
         */
        default AwsEcsComponentBuilder operation(
                org.apache.camel.component.aws.ecs.ECSOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * To define a proxy host when instantiating the ECS client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsEcsComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the ECS client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default AwsEcsComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the ECS client.
         * 
         * The option is a: <code>com.amazonaws.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default AwsEcsComponentBuilder proxyProtocol(
                com.amazonaws.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which ECS client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsEcsComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsEcsComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AwsEcsComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
    }

    class AwsEcsComponentBuilderImpl
            extends
                AbstractComponentBuilder<ECSComponent>
            implements
                AwsEcsComponentBuilder {
        @Override
        protected ECSComponent buildConcreteComponent() {
            return new ECSComponent();
        }
        private org.apache.camel.component.aws.ecs.ECSConfiguration getOrCreateConfiguration(
                org.apache.camel.component.aws.ecs.ECSComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws.ecs.ECSConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "accessKey": getOrCreateConfiguration((ECSComponent) component).setAccessKey((java.lang.String) value); return true;
            case "configuration": ((ECSComponent) component).setConfiguration((org.apache.camel.component.aws.ecs.ECSConfiguration) value); return true;
            case "ecsClient": getOrCreateConfiguration((ECSComponent) component).setEcsClient((com.amazonaws.services.ecs.AmazonECS) value); return true;
            case "lazyStartProducer": ((ECSComponent) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((ECSComponent) component).setOperation((org.apache.camel.component.aws.ecs.ECSOperations) value); return true;
            case "proxyHost": getOrCreateConfiguration((ECSComponent) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((ECSComponent) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((ECSComponent) component).setProxyProtocol((com.amazonaws.Protocol) value); return true;
            case "region": getOrCreateConfiguration((ECSComponent) component).setRegion((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((ECSComponent) component).setSecretKey((java.lang.String) value); return true;
            case "basicPropertyBinding": ((ECSComponent) component).setBasicPropertyBinding((boolean) value); return true;
            default: return false;
            }
        }
    }
}