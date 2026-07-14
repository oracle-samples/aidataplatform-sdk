// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* A node in a diagram, representing logic, data, or operation.
*/
export interface AgentDiagramNode {
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
    /**
    * Unique identifier for the node.
    */
    'key': string;
    /**
    * RFC3339 timestamp when node was created.
    */
    'timeCreated'?: Date;
    /**
    * RFC3339 timestamp when node was last updated.
    */
    'timeUpdated'?: Date;
    /**
    * Array of NodeInput objects.
    */
    'inputs'?: Array<model.NodeInput>;
    /**
    * Array of NodeOutput objects.
    */
    'outputs'?: Array<model.NodeOutput>;
    /**
    * List of validation errors encountered in the diagram.
    */
    'validationErrors'?: Array<model.ValidationError>;

   "type": string;
}

export namespace AgentDiagramNode {
















    export function getJsonObj(obj: AgentDiagramNode): object {
        const jsonObj = {...obj, ...{
            












                'inputs': obj.inputs ?
                
                obj.inputs.map((item)=>{return model.NodeInput.getJsonObj(item)})
                
                 : undefined,
                'outputs': obj.outputs ?
                
                obj.outputs.map((item)=>{return model.NodeOutput.getJsonObj(item)})
                
                 : undefined,
                'validationErrors': obj.validationErrors ?
                
                obj.validationErrors.map((item)=>{return model.ValidationError.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        if (obj && "type" in obj && obj.type) {
            switch (obj.type) {
                case "SUPERVISOR_AGENT":
                    return model.AgentDiagramSupervisorAgentNode.getJsonObj(<model.AgentDiagramSupervisorAgentNode>(<object>jsonObj), true);
                case "SQL_TOOL":
                    return model.AgentDiagramSqlToolNode.getJsonObj(<model.AgentDiagramSqlToolNode>(<object>jsonObj), true);
                case "CUSTOM_TOOL":
                    return model.AgentDiagramCustomToolNode.getJsonObj(<model.AgentDiagramCustomToolNode>(<object>jsonObj), true);
                case "START_NODE":
                    return model.AgentDiagramStartNode.getJsonObj(<model.AgentDiagramStartNode>(<object>jsonObj), true);
                case "PROMPT_TOOL":
                    return model.AgentDiagramPromptToolNode.getJsonObj(<model.AgentDiagramPromptToolNode>(<object>jsonObj), true);
                case "RAG_TOOL":
                    return model.AgentDiagramRagToolNode.getJsonObj(<model.AgentDiagramRagToolNode>(<object>jsonObj), true);
                case "MCP_TOOL":
                    return model.AgentDiagramMcpToolNode.getJsonObj(<model.AgentDiagramMcpToolNode>(<object>jsonObj), true);
                case "GUARDRAILS":
                    return model.AgentDiagramGuardrailNode.getJsonObj(<model.AgentDiagramGuardrailNode>(<object>jsonObj), true);
                case "AGENT":
                    return model.AgentDiagramAgentNode.getJsonObj(<model.AgentDiagramAgentNode>(<object>jsonObj), true);
                case "HTTP_TOOL":
                    return model.AgentDiagramHttpToolNode.getJsonObj(<model.AgentDiagramHttpToolNode>(<object>jsonObj), true);
                default:
                    if (common.LOG.logger) common.LOG.logger.info(`Unknown value for: ${obj.type}`)

        }
        }
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AgentDiagramNode): object {
        const jsonObj = {...obj, ...{
            












                    'inputs': obj.inputs ?
                
                obj.inputs.map((item)=>{return model.NodeInput.getDeserializedJsonObj(item)})
                
                 : undefined,
                    'outputs': obj.outputs ?
                
                obj.outputs.map((item)=>{return model.NodeOutput.getDeserializedJsonObj(item)})
                
                 : undefined,
                    'validationErrors': obj.validationErrors ?
                
                obj.validationErrors.map((item)=>{return model.ValidationError.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        if (obj && "type" in obj && obj.type) {
            switch (obj.type) {
                case "SUPERVISOR_AGENT":
                    return model.AgentDiagramSupervisorAgentNode.getDeserializedJsonObj(<model.AgentDiagramSupervisorAgentNode>(<object>jsonObj), true);
                case "SQL_TOOL":
                    return model.AgentDiagramSqlToolNode.getDeserializedJsonObj(<model.AgentDiagramSqlToolNode>(<object>jsonObj), true);
                case "CUSTOM_TOOL":
                    return model.AgentDiagramCustomToolNode.getDeserializedJsonObj(<model.AgentDiagramCustomToolNode>(<object>jsonObj), true);
                case "START_NODE":
                    return model.AgentDiagramStartNode.getDeserializedJsonObj(<model.AgentDiagramStartNode>(<object>jsonObj), true);
                case "PROMPT_TOOL":
                    return model.AgentDiagramPromptToolNode.getDeserializedJsonObj(<model.AgentDiagramPromptToolNode>(<object>jsonObj), true);
                case "RAG_TOOL":
                    return model.AgentDiagramRagToolNode.getDeserializedJsonObj(<model.AgentDiagramRagToolNode>(<object>jsonObj), true);
                case "MCP_TOOL":
                    return model.AgentDiagramMcpToolNode.getDeserializedJsonObj(<model.AgentDiagramMcpToolNode>(<object>jsonObj), true);
                case "GUARDRAILS":
                    return model.AgentDiagramGuardrailNode.getDeserializedJsonObj(<model.AgentDiagramGuardrailNode>(<object>jsonObj), true);
                case "AGENT":
                    return model.AgentDiagramAgentNode.getDeserializedJsonObj(<model.AgentDiagramAgentNode>(<object>jsonObj), true);
                case "HTTP_TOOL":
                    return model.AgentDiagramHttpToolNode.getDeserializedJsonObj(<model.AgentDiagramHttpToolNode>(<object>jsonObj), true);
                default:
                    if (common.LOG.logger) common.LOG.logger.info(`Unknown value for: ${obj.type}`)
        }
        }
        return jsonObj;
    }
}
