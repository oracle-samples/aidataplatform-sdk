// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* File paths and resolution action for a Git conflict resolution request.
*/
export interface ConflictResolveDetails {
    /**
    * Repository-relative paths of the conflicted files to resolve or stage.
* 
    */
    'files': Array<string>;
    /**
    * LOCAL selects the local version and REMOTE selects the incoming version, with
* Git side mapping adjusted during rebase. MARK_RESOLVED stages manually
* resolved workspace content.
* 
    */
    'action': ConflictResolveDetails.Action;

}

export namespace ConflictResolveDetails {


    export enum Action {
    
    Local = "LOCAL",
    Remote = "REMOTE",
    MarkResolved = "MARK_RESOLVED"

}


    export function getJsonObj(obj: ConflictResolveDetails): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ConflictResolveDetails): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
