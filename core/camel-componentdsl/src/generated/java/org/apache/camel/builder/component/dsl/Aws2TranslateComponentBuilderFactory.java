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
import org.apache.camel.component.aws2.translate.Translate2Component;

/**
 * Translate texts using AWS Translate and AWS SDK version 2.x.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Aws2TranslateComponentBuilderFactory {

    /**
     * AWS 2 Translate (camel-aws2-translate)
     * Translate texts using AWS Translate and AWS SDK version 2.x.
     * 
     * Category: cloud,management
     * Since: 3.1
     * Maven coordinates: org.apache.camel:camel-aws2-translate
     */
    static Aws2TranslateComponentBuilder aws2Translate() {
        return new Aws2TranslateComponentBuilderImpl();
    }

    /**
     * Builder for the AWS 2 Translate component.
     */
    interface Aws2TranslateComponentBuilder
            extends
                ComponentBuilder<Translate2Component> {
        /**
         * Being able to autodetect the source language.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Aws2TranslateComponentBuilder autodetectSourceLanguage(
                boolean autodetectSourceLanguage) {
            doSetProperty("autodetectSourceLanguage", autodetectSourceLanguage);
            return this;
        }
        /**
         * Component configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.translate.Translate2Configuration</code> type.
         * 
         * Group: producer
         */
        default Aws2TranslateComponentBuilder configuration(
                org.apache.camel.component.aws2.translate.Translate2Configuration configuration) {
            doSetProperty("configuration", configuration);
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
        default Aws2TranslateComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.translate.Translate2Operations</code> type.
         * 
         * Default: translateText
         * Group: producer
         */
        default Aws2TranslateComponentBuilder operation(
                org.apache.camel.component.aws2.translate.Translate2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Aws2TranslateComponentBuilder pojoRequest(boolean pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Translate client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2TranslateComponentBuilder proxyHost(
                java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Translate client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default Aws2TranslateComponentBuilder proxyPort(
                java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Translate client.
         * 
         * The option is a: <code>software.amazon.awssdk.core.Protocol</code>
         * type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default Aws2TranslateComponentBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which Translate client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2TranslateComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Source language to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2TranslateComponentBuilder sourceLanguage(
                java.lang.String sourceLanguage) {
            doSetProperty("sourceLanguage", sourceLanguage);
            return this;
        }
        /**
         * Target language to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2TranslateComponentBuilder targetLanguage(
                java.lang.String targetLanguage) {
            doSetProperty("targetLanguage", targetLanguage);
            return this;
        }
        /**
         * To use a existing configured AWS Translate as client.
         * 
         * The option is a:
         * <code>software.amazon.awssdk.services.translate.TranslateClient</code> type.
         * 
         * Group: producer
         */
        default Aws2TranslateComponentBuilder translateClient(
                software.amazon.awssdk.services.translate.TranslateClient translateClient) {
            doSetProperty("translateClient", translateClient);
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
        default Aws2TranslateComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default Aws2TranslateComponentBuilder accessKey(
                java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default Aws2TranslateComponentBuilder secretKey(
                java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    class Aws2TranslateComponentBuilderImpl
            extends
                AbstractComponentBuilder<Translate2Component>
            implements
                Aws2TranslateComponentBuilder {
        @Override
        protected Translate2Component buildConcreteComponent() {
            return new Translate2Component();
        }
        private org.apache.camel.component.aws2.translate.Translate2Configuration getOrCreateConfiguration(
                org.apache.camel.component.aws2.translate.Translate2Component component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws2.translate.Translate2Configuration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "autodetectSourceLanguage": getOrCreateConfiguration((Translate2Component) component).setAutodetectSourceLanguage((boolean) value); return true;
            case "configuration": ((Translate2Component) component).setConfiguration((org.apache.camel.component.aws2.translate.Translate2Configuration) value); return true;
            case "lazyStartProducer": ((Translate2Component) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((Translate2Component) component).setOperation((org.apache.camel.component.aws2.translate.Translate2Operations) value); return true;
            case "pojoRequest": getOrCreateConfiguration((Translate2Component) component).setPojoRequest((boolean) value); return true;
            case "proxyHost": getOrCreateConfiguration((Translate2Component) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((Translate2Component) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((Translate2Component) component).setProxyProtocol((software.amazon.awssdk.core.Protocol) value); return true;
            case "region": getOrCreateConfiguration((Translate2Component) component).setRegion((java.lang.String) value); return true;
            case "sourceLanguage": getOrCreateConfiguration((Translate2Component) component).setSourceLanguage((java.lang.String) value); return true;
            case "targetLanguage": getOrCreateConfiguration((Translate2Component) component).setTargetLanguage((java.lang.String) value); return true;
            case "translateClient": getOrCreateConfiguration((Translate2Component) component).setTranslateClient((software.amazon.awssdk.services.translate.TranslateClient) value); return true;
            case "basicPropertyBinding": ((Translate2Component) component).setBasicPropertyBinding((boolean) value); return true;
            case "accessKey": getOrCreateConfiguration((Translate2Component) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((Translate2Component) component).setSecretKey((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}