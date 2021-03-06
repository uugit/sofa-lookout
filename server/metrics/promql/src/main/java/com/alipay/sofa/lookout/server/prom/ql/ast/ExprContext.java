/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.lookout.server.prom.ql.ast;

import com.alipay.sofa.lookout.server.prom.ql.lex.ItemType;

import java.util.List;

/**
 * Expr Context
 *
 * @author yuanxuan
 * @version $Id: ExprContext.java, v 0.1 2018年11月23日 11:29 yuanxuan Exp $
 */
public class ExprContext {

    /**
     * fetch data size limit
     */
    protected long         limit;
    protected boolean      vectorSelector;
    protected ItemType     aggregationType;
    protected List<String> grouping;

    public long getLimit() {
        return limit;
    }

    public void setLimit(long limit) {
        this.limit = limit;
    }

    public ItemType getAggregationType() {
        return aggregationType;
    }

    public void setAggregationType(ItemType aggregationType) {
        this.aggregationType = aggregationType;
    }

    public List<String> getGrouping() {
        return grouping;
    }

    public void setGrouping(List<String> grouping) {
        this.grouping = grouping;
    }

    public boolean isVectorSelector() {
        return vectorSelector;
    }

    public ExprContext setVectorSelector(boolean vectorSelector) {
        this.vectorSelector = vectorSelector;
        return this;
    }
}