// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Deployment configuration snapshot stored with an activity, recording the configuration the operation left behind. Every property is optional; a null value means the value is not available from any upstream system. Working out which values changed -- by comparing an activity against the one before it -- is left to the consumer.
*/
export interface DeploymentDetails {
    /**
    * Name of the deployment.
    */
    'name'?: string;
    /**
    * Description of the deployment.
    */
    'description'?: string;
    /**
    * Name of the registered model.
    */
    'modelName'?: string;
    /**
    * Deployment targets of the deployment.
    */
    'deploymentTargets'?: Array<model.DeploymentTarget>;
    /**
    * Status of the deployment.
    */
    'status'?: model.DeploymentStatus;
    /**
    * Serving endpoint of the deployment.
    */
    'endpoint'?: string;
    /**
    * Tags of the deployment.
    */
    'tags'?: { [key: string]: string; };
    /**
    * Workspace key of the deployment.
    */
    'workspaceKey'?: string;
    /**
    * Display name of the deployment's workspace.
    */
    'workspaceName'?: string;
    /**
    * Compute key of the deployment.
    */
    'computeKey'?: string;
    /**
    * Display name of the compute cluster the deployment targets.
    */
    'computeName'?: string;
    /**
    * OCPUs of the compute cluster shape. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'ocpus'?: number;
    /**
    * Memory in GB of the compute cluster shape. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'memoryInGbs'?: number;
    /**
    * Whether the compute cluster autoscales.
    */
    'autoscaling'?: boolean;
    /**
    * Minimum number of compute replicas. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'minInstances'?: number;
    /**
    * Maximum number of compute replicas. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'maxInstances'?: number;
    /**
    * Number of replicas running. Not reported by AI Compute today, so always null. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'instances'?: number;
    /**
    * Request concurrency. Not modelled by AI Compute today, so always null. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'concurrency'?: number;
    /**
    * Autoscaling CPU target percentage. Not modelled by AI Compute today, so always null. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'cpuTarget'?: number;
    /**
    * Autoscaling cooldown in minutes. Not modelled by AI Compute today, so always null. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'cooldown'?: number;
    /**
    * Autoscaling metric. Not modelled by AI Compute today, so always null.
    */
    'metric'?: string;
    /**
    * Endpoint authorization mode: the deployment's authType (OAUTH or AIDP).
    */
    'authorizeUsing'?: string;
    /**
    * OAuth audience claims (aud). Set for OAUTH deployments; null otherwise.
    */
    'audienceClaim'?: Array<string>;
    /**
    * OAuth issuer claim (iss). Set for OAUTH deployments; null otherwise.
    */
    'issuerClaim'?: string;
    /**
    * URI to retrieve the JWKS. Set for OAUTH deployments; null otherwise.
    */
    'jwksUri'?: string;

}

export namespace DeploymentDetails {


























    export function getJsonObj(obj: DeploymentDetails): object {
        const jsonObj = {...obj, ...{
            


                'model_name': obj.modelName,

                'deployment_targets': obj.deploymentTargets ?
                
                obj.deploymentTargets.map((item)=>{return model.DeploymentTarget.getJsonObj(item)})
                
                 : undefined,








                'memory_in_gbs': obj.memoryInGbs,


                'min_instances': obj.minInstances,

                'max_instances': obj.maxInstances,



                'cpu_target': obj.cpuTarget,



                'authorize_using': obj.authorizeUsing,

                'audience_claim': obj.audienceClaim,

                'issuer_claim': obj.issuerClaim,

                'jwks_uri': obj.jwksUri,

        }};

        delete (jsonObj as Partial<DeploymentDetails>).modelName;delete (jsonObj as Partial<DeploymentDetails>).deploymentTargets;delete (jsonObj as Partial<DeploymentDetails>).memoryInGbs;delete (jsonObj as Partial<DeploymentDetails>).minInstances;delete (jsonObj as Partial<DeploymentDetails>).maxInstances;delete (jsonObj as Partial<DeploymentDetails>).cpuTarget;delete (jsonObj as Partial<DeploymentDetails>).authorizeUsing;delete (jsonObj as Partial<DeploymentDetails>).audienceClaim;delete (jsonObj as Partial<DeploymentDetails>).issuerClaim;delete (jsonObj as Partial<DeploymentDetails>).jwksUri;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeploymentDetails): object {
        const jsonObj = {...obj, ...{
            


                'modelName': (obj as any)["model_name"],

                    'deploymentTargets': (obj as any)["deployment_targets"] ?
                
                (obj as any)["deployment_targets"].map((item: any)=>{return model.DeploymentTarget.getDeserializedJsonObj(item)})
                
                 : undefined,








                'memoryInGbs': (obj as any)["memory_in_gbs"],


                'minInstances': (obj as any)["min_instances"],

                'maxInstances': (obj as any)["max_instances"],



                'cpuTarget': (obj as any)["cpu_target"],



                'authorizeUsing': (obj as any)["authorize_using"],

                'audienceClaim': (obj as any)["audience_claim"],

                'issuerClaim': (obj as any)["issuer_claim"],

                'jwksUri': (obj as any)["jwks_uri"],

         }};

        delete (jsonObj as any)["model_name"];delete (jsonObj as any)["deployment_targets"];delete (jsonObj as any)["memory_in_gbs"];delete (jsonObj as any)["min_instances"];delete (jsonObj as any)["max_instances"];delete (jsonObj as any)["cpu_target"];delete (jsonObj as any)["authorize_using"];delete (jsonObj as any)["audience_claim"];delete (jsonObj as any)["issuer_claim"];delete (jsonObj as any)["jwks_uri"];
        
        return jsonObj;
    }
}
