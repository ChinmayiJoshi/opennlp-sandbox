/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.opennlp.caseditor.namefinder;

public class Entity {
  
  private final int beginIndex;
  private final int endIndex;
  
  private final String entityText;
 
  private Double confidence;
  
  Entity(int beginIndex, int endIndex, String entityText, Double confidence) {
    this.beginIndex = beginIndex;
    this.endIndex = endIndex;
    
    this.entityText = entityText;
    
    this.confidence = confidence;
  }
  
  int getBeginIndex() {
    return beginIndex;
  }
  
  int getEndIndex() {
    return endIndex;
  }
  
  String getEntityText() {
    return entityText;
  }
  
  void setConfidence(Double confidence) {
    this.confidence = confidence;
  }
  
  Double getConfidence() {
    return confidence;
  }
  
  @Override
  public String toString() {
    return entityText;
  }
}