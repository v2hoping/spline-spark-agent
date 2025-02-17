/*
 * Copyright 2020 ABSA Group Limited
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

package za.co.absa.spline.harvester.dispatcher.httpdispatcher.modelmapper

import za.co.absa.spline.producer.model.v1_1.{ExecutionEvent, ExecutionPlan}

object ModelMapperV1_1 extends ModelMapper {

  // v1.1 is fully compatible with v1.2

  override def toDTO(plan: ExecutionPlan): AnyRef = ModelMapperV1_2.toDTO(plan)

  override def toDTO(event: ExecutionEvent): AnyRef = ModelMapperV1_2.toDTO(event)
}
