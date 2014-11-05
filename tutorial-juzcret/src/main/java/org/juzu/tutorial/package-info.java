/*
 * Copyright 2013 eXo Platform SAS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@juzu.Application(defaultController = org.juzu.tutorial.JuZcretApplication.class)
@Bindings({ @Binding(value = SecretService.class, implementation = SecretServiceJCRImpl.class),
          @Binding(value = SessionProviderService.class), @Binding(value = NodeHierarchyCreator.class)})
@WebJars(@WebJar("jquery"))
@Less(@Stylesheet("styles/juzcret.less"))
@Scripts({
    @Script(id = "jquery", value = "jquery/1.10.2/jquery.js"),
    @Script(value = "javascripts/secret.js", depends = "jquery")
})
@Assets("*")
package org.juzu.tutorial;

import juzu.plugin.asset.Assets;
import juzu.plugin.asset.Script;
import juzu.plugin.asset.Scripts;
import juzu.plugin.asset.Stylesheet;
import juzu.plugin.binding.Binding;
import juzu.plugin.binding.Bindings;
import juzu.plugin.less4j.Less;
import juzu.plugin.webjars.WebJar;
import juzu.plugin.webjars.WebJars;

import org.exoplatform.services.jcr.ext.app.SessionProviderService;
import org.exoplatform.services.jcr.ext.hierarchy.NodeHierarchyCreator;
import org.juzu.tutorial.services.SecretService;
import org.juzu.tutorial.services.SecretServiceJCRImpl;

