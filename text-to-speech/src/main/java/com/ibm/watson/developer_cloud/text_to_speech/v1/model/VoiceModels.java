/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.text_to_speech.v1.model;

import java.util.List;

import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * VoiceModels.
 */
public class VoiceModels extends GenericModel {

  private List<VoiceModel> customizations;

  /**
   * Gets the customizations.
   *
   * An array of `VoiceModel` objects that provides information about each available custom voice model. The array is
   * empty if the requesting service credentials own no custom voice models (if no language is specified) or own no
   * custom voice models for the specified language.
   *
   * @return the customizations
   */
  public List<VoiceModel> getCustomizations() {
    return customizations;
  }
}