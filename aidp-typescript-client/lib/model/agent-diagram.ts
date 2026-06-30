// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Diagrammatic representation of the agent with all node and edge details.
*/
export interface AgentDiagram {
    /**
    * The unique identifier (UUID) of the agent.
    */
    'key'?: string;
    /**
    * Agent name.
    */
    'displayName'?: string;
    /**
    * Agent description.
    */
    'description'?: string;
    /**
    * The model and upgrade compatibility version for this agent diagram.
    */
    'modelVersion'?: string;
    /**
    * Mapping of nodeId to node objects.
    */
    'nodes'?: { [key: string]: model.AgentDiagramNode; };
    /**
    * Mapping of edgeId to edge objects.
    */
    'edges'?: { [key: string]: model.AgentEdge; };
    /**
    * A hash map with key=tool key, value=tool definition. It is used to find the tool definition for a tool reference, where the tool is marked as a reference.
    */
    'toolsMap'?: { [key: string]: model.Tool; };
    /**
    * A hash map with key=guardrails config key, value=guardrails definition. It is used to find the guardrails definition for a guardrails reference by name.
    */
    'guardrailsMap'?: { [key: string]: model.GuardrailsConfiguration; };

}

export namespace AgentDiagram {









    export function getJsonObj(obj: AgentDiagram): object {
        const jsonObj = {...obj, ...{
            




                'nodes': obj.nodes ?
                
                
                common.mapContainer(obj.nodes, model.AgentDiagramNode.getJsonObj)
                 : undefined,
                'edges': obj.edges ?
                
                
                common.mapContainer(obj.edges, model.AgentEdge.getJsonObj)
                 : undefined,
                'toolsMap': obj.toolsMap ?
                
                
                common.mapContainer(obj.toolsMap, model.Tool.getJsonObj)
                 : undefined,
                'guardrailsMap': obj.guardrailsMap ?
                
                
                common.mapContainer(obj.guardrailsMap, model.GuardrailsConfiguration.getJsonObj)
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AgentDiagram): object {
        const jsonObj = {...obj, ...{
            




                    'nodes': obj.nodes ?
                
                
                common.mapContainer(obj.nodes, model.AgentDiagramNode.getDeserializedJsonObj)
                 : undefined,
                    'edges': obj.edges ?
                
                
                common.mapContainer(obj.edges, model.AgentEdge.getDeserializedJsonObj)
                 : undefined,
                    'toolsMap': obj.toolsMap ?
                
                
                common.mapContainer(obj.toolsMap, model.Tool.getDeserializedJsonObj)
                 : undefined,
                    'guardrailsMap': obj.guardrailsMap ?
                
                
                common.mapContainer(obj.guardrailsMap, model.GuardrailsConfiguration.getDeserializedJsonObj)
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
