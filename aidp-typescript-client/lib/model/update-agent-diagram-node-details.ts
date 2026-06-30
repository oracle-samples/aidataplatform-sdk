// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Fields that can be updated in an existing node.
*/
export interface UpdateAgentDiagramNodeDetails {
    /**
    * This field is deprecated. | It does not need to be set to any value for API calls.
    */
    'nodeType'?: string;
    /**
    * Name of this node.
    */
    'name'?: string;
    /**
    * Description of this node.
    */
    'description'?: string;
    /**
    * Canvas X coordinate. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'positionX'?: number;
    /**
    * Canvas Y coordinate. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'positionY'?: number;
    /**
    * Is node expanded in UI.
    */
    'isExpanded'?: boolean;
    /**
    * Parent node ID, for subgraphs.
    */
    'parentNodeId'?: string;
    /**
    * Configuration object for this node.
    */
    'configuration'?: { [key: string]: any; };
    /**
    * Definition ID for this node type.
    */
    'nodeTypeId'?: string;

   "type": string;
}

export namespace UpdateAgentDiagramNodeDetails {










    export function getJsonObj(obj: UpdateAgentDiagramNodeDetails): object {
        const jsonObj = {...obj, ...{
            









        }};

        
        
        if (obj && "type" in obj && obj.type) {
            switch (obj.type) {
                case "SQL_TOOL":
                    return model.UpdateAgentDiagramSqlToolNodeDetails.getJsonObj(<model.UpdateAgentDiagramSqlToolNodeDetails>(<object>jsonObj), true);
                case "HTTP_TOOL":
                    return model.UpdateAgentDiagramHttpToolNodeDetails.getJsonObj(<model.UpdateAgentDiagramHttpToolNodeDetails>(<object>jsonObj), true);
                case "MCP_TOOL":
                    return model.UpdateAgentDiagramMcpToolNodeDetails.getJsonObj(<model.UpdateAgentDiagramMcpToolNodeDetails>(<object>jsonObj), true);
                case "PROMPT_TOOL":
                    return model.UpdateAgentDiagramPromptToolNodeDetails.getJsonObj(<model.UpdateAgentDiagramPromptToolNodeDetails>(<object>jsonObj), true);
                case "CUSTOM_TOOL":
                    return model.UpdateAgentDiagramCustomToolNodeDetails.getJsonObj(<model.UpdateAgentDiagramCustomToolNodeDetails>(<object>jsonObj), true);
                case "AGENT":
                    return model.UpdateAgentDiagramAgentNodeDetails.getJsonObj(<model.UpdateAgentDiagramAgentNodeDetails>(<object>jsonObj), true);
                case "RAG_TOOL":
                    return model.UpdateAgentDiagramRagToolNodeDetails.getJsonObj(<model.UpdateAgentDiagramRagToolNodeDetails>(<object>jsonObj), true);
                default:
                    if (common.LOG.logger) common.LOG.logger.info(`Unknown value for: ${obj.type}`)

        }
        }
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: UpdateAgentDiagramNodeDetails): object {
        const jsonObj = {...obj, ...{
            









         }};

        
        
        if (obj && "type" in obj && obj.type) {
            switch (obj.type) {
                case "SQL_TOOL":
                    return model.UpdateAgentDiagramSqlToolNodeDetails.getDeserializedJsonObj(<model.UpdateAgentDiagramSqlToolNodeDetails>(<object>jsonObj), true);
                case "HTTP_TOOL":
                    return model.UpdateAgentDiagramHttpToolNodeDetails.getDeserializedJsonObj(<model.UpdateAgentDiagramHttpToolNodeDetails>(<object>jsonObj), true);
                case "MCP_TOOL":
                    return model.UpdateAgentDiagramMcpToolNodeDetails.getDeserializedJsonObj(<model.UpdateAgentDiagramMcpToolNodeDetails>(<object>jsonObj), true);
                case "PROMPT_TOOL":
                    return model.UpdateAgentDiagramPromptToolNodeDetails.getDeserializedJsonObj(<model.UpdateAgentDiagramPromptToolNodeDetails>(<object>jsonObj), true);
                case "CUSTOM_TOOL":
                    return model.UpdateAgentDiagramCustomToolNodeDetails.getDeserializedJsonObj(<model.UpdateAgentDiagramCustomToolNodeDetails>(<object>jsonObj), true);
                case "AGENT":
                    return model.UpdateAgentDiagramAgentNodeDetails.getDeserializedJsonObj(<model.UpdateAgentDiagramAgentNodeDetails>(<object>jsonObj), true);
                case "RAG_TOOL":
                    return model.UpdateAgentDiagramRagToolNodeDetails.getDeserializedJsonObj(<model.UpdateAgentDiagramRagToolNodeDetails>(<object>jsonObj), true);
                default:
                    if (common.LOG.logger) common.LOG.logger.info(`Unknown value for: ${obj.type}`)
        }
        }
        return jsonObj;
    }
}
