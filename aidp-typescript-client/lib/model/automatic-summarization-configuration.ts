// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Configuration for automatic summarization of an Agent Flow session's conversation history. If omitted, automatic summarization is disabled.
*/
export interface AutomaticSummarizationConfiguration {
    /**
    * Whether automatic conversation-history summarization is enabled for this Agent Flow. The setting is ineffective for agent nodes whose memory is disabled.
    */
    'isEnabled'?: boolean;

}

export namespace AutomaticSummarizationConfiguration {


    export function getJsonObj(obj: AutomaticSummarizationConfiguration): object {
        const jsonObj = {...obj, ...{
            

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AutomaticSummarizationConfiguration): object {
        const jsonObj = {...obj, ...{
            

         }};

        
        
        return jsonObj;
    }
}
