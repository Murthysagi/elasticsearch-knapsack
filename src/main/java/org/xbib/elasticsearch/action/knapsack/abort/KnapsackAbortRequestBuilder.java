/*
 * Copyright (C) 2014 Jörg Prante
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.xbib.elasticsearch.action.knapsack.abort;

import org.elasticsearch.action.ActionRequestBuilder;
import org.elasticsearch.client.ElasticsearchClient;

public class KnapsackAbortRequestBuilder extends ActionRequestBuilder<KnapsackAbortRequest, KnapsackAbortResponse, KnapsackAbortRequestBuilder> {

    public KnapsackAbortRequestBuilder(ElasticsearchClient client) {
        super(client, KnapsackAbortAction.INSTANCE, new KnapsackAbortRequest());
    }

    public KnapsackAbortRequestBuilder setReset(boolean reset) {
        request().setReset(reset);
        return this;
    }

}
