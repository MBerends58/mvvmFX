/*******************************************************************************
 * Copyright 2018 Manuel Mauky
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package de.saxsys.mvvmfx.utils.mapping.accessorfunctions;

import javafx.beans.property.MapProperty;

import java.util.function.Function;

/**
 * A functional interface to define an accessor method for a property of a map type.
 *
 * @param <M> the generic type of the model.
 * @param <K> the type of the key elements
 * @param <V> the type of the value elements
 */
@FunctionalInterface
public interface MapPropertyAccessor<M, K, V> extends Function<M, MapProperty<K, V>> {

	/**
	 * @param model the model instance
	 *
	 * @return the property field of the model
	 */
	@Override
	MapProperty<K, V> apply(M model);
}