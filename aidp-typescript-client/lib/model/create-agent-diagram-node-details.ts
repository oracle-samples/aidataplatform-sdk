// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details required to create a new node in a diagram.
*/
export interface CreateAgentDiagramNodeDetails {
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
    * Source node to which this node is connected.
    */
    'srcNodeId'?: string;
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

export namespace CreateAgentDiagramNodeDetails {











    export function getJsonObj(obj: CreateAgentDiagramNodeDetails): object {
        const jsonObj = {...obj, ...{
            










        }};

        
        
        if (obj && "type" in obj && obj.type) {
            switch (obj.type) {
                case "RAG_TOOL":
                    return model.CreateAgentDiagramRagToolNodeDetails.getJsonObj(<model.CreateAgentDiagramRagToolNodeDetails>(<object>jsonObj), true);
                case "HTTP_TOOL":
                    return model.CreateAgentDiagramHttpToolNodeDetails.getJsonObj(<model.CreateAgentDiagramHttpToolNodeDetails>(<object>jsonObj), true);
                case "AGENT":
                    return model.CreateAgentDiagramAgentNodeDetails.getJsonObj(<model.CreateAgentDiagramAgentNodeDetails>(<object>jsonObj), true);
                case "SQL_TOOL":
                    return model.CreateAgentDiagramSqlToolNodeDetails.getJsonObj(<model.CreateAgentDiagramSqlToolNodeDetails>(<object>jsonObj), true);
                case "CUSTOM_TOOL":
                    return model.CreateAgentDiagramCustomToolNodeDetails.getJsonObj(<model.CreateAgentDiagramCustomToolNodeDetails>(<object>jsonObj), true);
                case "MCP_TOOL":
                    return model.CreateAgentDiagramMcpToolNodeDetails.getJsonObj(<model.CreateAgentDiagramMcpToolNodeDetails>(<object>jsonObj), true);
                case "PROMPT_TOOL":
                    return model.CreateAgentDiagramPromptToolNodeDetails.getJsonObj(<model.CreateAgentDiagramPromptToolNodeDetails>(<object>jsonObj), true);
                default:
                    if (common.LOG.logger) common.LOG.logger.info(`Unknown value for: ${obj.type}`)

        }
        }
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: CreateAgentDiagramNodeDetails): object {
        const jsonObj = {...obj, ...{
            










         }};

        
        
        if (obj && "type" in obj && obj.type) {
            switch (obj.type) {
                case "RAG_TOOL":
                    return model.CreateAgentDiagramRagToolNodeDetails.getDeserializedJsonObj(<model.CreateAgentDiagramRagToolNodeDetails>(<object>jsonObj), true);
                case "HTTP_TOOL":
                    return model.CreateAgentDiagramHttpToolNodeDetails.getDeserializedJsonObj(<model.CreateAgentDiagramHttpToolNodeDetails>(<object>jsonObj), true);
                case "AGENT":
                    return model.CreateAgentDiagramAgentNodeDetails.getDeserializedJsonObj(<model.CreateAgentDiagramAgentNodeDetails>(<object>jsonObj), true);
                case "SQL_TOOL":
                    return model.CreateAgentDiagramSqlToolNodeDetails.getDeserializedJsonObj(<model.CreateAgentDiagramSqlToolNodeDetails>(<object>jsonObj), true);
                case "CUSTOM_TOOL":
                    return model.CreateAgentDiagramCustomToolNodeDetails.getDeserializedJsonObj(<model.CreateAgentDiagramCustomToolNodeDetails>(<object>jsonObj), true);
                case "MCP_TOOL":
                    return model.CreateAgentDiagramMcpToolNodeDetails.getDeserializedJsonObj(<model.CreateAgentDiagramMcpToolNodeDetails>(<object>jsonObj), true);
                case "PROMPT_TOOL":
                    return model.CreateAgentDiagramPromptToolNodeDetails.getDeserializedJsonObj(<model.CreateAgentDiagramPromptToolNodeDetails>(<object>jsonObj), true);
                default:
                    if (common.LOG.logger) common.LOG.logger.info(`Unknown value for: ${obj.type}`)
        }
        }
        return jsonObj;
    }
}
