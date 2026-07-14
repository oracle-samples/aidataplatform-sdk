// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Text and background color configuration for a node input/output.
*/
export interface NodeIoColor {
    /**
    * Whether the text on badges should be dark or light for visibility.
    */
    'textColor': NodeIoColor.TextColor;
    /**
    * Input/output badge background color.
    */
    'backgroundColor': string;
    /**
    * Input/output connector handle color.
    */
    'handleColor': string;

}

export namespace NodeIoColor {

    export enum TextColor {
    
    Dark = "DARK",
    Light = "LIGHT",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}




    export function getJsonObj(obj: NodeIoColor): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: NodeIoColor): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
