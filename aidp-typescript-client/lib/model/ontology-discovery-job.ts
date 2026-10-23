// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Ontology discovery job metadata.
*/
export interface OntologyDiscoveryJob {
    /**
    * Discovery job identifier.
    */
    'id'?: string;
    /**
    * Ontology project key.
    */
    'projectKey'?: string;
    /**
    * Discovery job display name.
    */
    'displayName'?: string;
    /**
    * Discovery job lifecycle state.
    */
    'lifecycleState'?: string;
    'progress'?: model.OntologyDiscoveryProgress;
    'artifacts'?: model.OntologyDiscoveryArtifacts;
    /**
    * Discovery failure code.
    */
    'errorCode'?: string;
    /**
    * Discovery failure message.
    */
    'errorMessage'?: string;
    /**
    * Discovery job creator.
    */
    'creator'?: string;
    /**
    * Discovery job creation time.
    */
    'timeCreated'?: Date;
    /**
    * Discovery job update time.
    */
    'timeUpdated'?: Date;

}

export namespace OntologyDiscoveryJob {












    export function getJsonObj(obj: OntologyDiscoveryJob): object {
        const jsonObj = {...obj, ...{
            




                'progress': obj.progress ?
                
                
                model.OntologyDiscoveryProgress.getJsonObj(obj.progress) : undefined,
                'artifacts': obj.artifacts ?
                
                
                model.OntologyDiscoveryArtifacts.getJsonObj(obj.artifacts) : undefined,





        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyDiscoveryJob): object {
        const jsonObj = {...obj, ...{
            




                    'progress': obj.progress ?
                
                
                model.OntologyDiscoveryProgress.getDeserializedJsonObj(obj.progress) : undefined,
                    'artifacts': obj.artifacts ?
                
                
                model.OntologyDiscoveryArtifacts.getDeserializedJsonObj(obj.artifacts) : undefined,





         }};

        
        
        return jsonObj;
    }
}
