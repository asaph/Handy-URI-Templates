/*
 * Copyright 2012, Ryan J. McDonough
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
package com.damnhandy.uri.template;

/**
 * A subclass of {@link Address} to verify that field-level annotation are still being
 * picked up by the {@link DefaultVarExploder}.
 *
 * @author <a href="ryan@damnhandy.com">Ryan J. McDonough</a>
 * @version $Revision: 1.1 $
 */
public class ExtendedAddress extends Address
{

   public String label;

   /**
    * Create a new ExtendedAddress.
    *
    */
   public ExtendedAddress()
   {
      super();
   }

   /**
    * Create a new ExtendedAddress.
    *
    * @param street
    * @param city
    * @param state
    * @param postalCode
    * @param country
    */
   public ExtendedAddress(String street, String city, String state, String postalCode, String country)
   {
      super(street, city, state, postalCode, country);
   }

   /**
    * Get the label.
    *
    * @return the label.
    */
   public String getLabel()
   {
      return label;
   }

   /**
    * Set the label.
    *
    * @param label The label to set.
    */
   public void setLabel(String label)
   {
      this.label = label;
   }
}
