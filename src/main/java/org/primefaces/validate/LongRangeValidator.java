/*
 * Copyright 2009-2014 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.validate;

import java.util.HashMap;
import java.util.Map;
import org.primefaces.util.HTML;

public class LongRangeValidator extends javax.faces.validator.LongRangeValidator implements ClientValidator {

    private Map<String,Object> metadata;
    
    public Map<String, Object> getMetadata() {
        metadata = new HashMap<String, Object>();
        long min = this.getMinimum();
        long max = this.getMaximum();
        
        if(min != 0)
            metadata.put(HTML.VALIDATION_METADATA.MIN_VALUE, min);
            
        if(max != 0)
            metadata.put(HTML.VALIDATION_METADATA.MAX_VALUE, max);
        
        return metadata;
    }

    public String getValidatorId() {
        return LongRangeValidator.VALIDATOR_ID;
    }
}
