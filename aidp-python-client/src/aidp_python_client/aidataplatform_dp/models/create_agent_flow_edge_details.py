# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateAgentFlowEdgeDetails(object):
    """
    Details required to create a new edge in a diagram.

    Excludes computed fields such as id, timeCreated, and timeUpdated.
    - srcNodeId: Source node identifier
    - destNodeId: Destination node identifier
    - srcNodeOutput: Source node's output port name
    - destNodeInput: Destination node's input port name
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateAgentFlowEdgeDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param src_node_id:
            The value to assign to the src_node_id property of this CreateAgentFlowEdgeDetails.
        :type src_node_id: str

        :param dest_node_id:
            The value to assign to the dest_node_id property of this CreateAgentFlowEdgeDetails.
        :type dest_node_id: str

        :param src_node_output:
            The value to assign to the src_node_output property of this CreateAgentFlowEdgeDetails.
        :type src_node_output: str

        :param dest_node_input:
            The value to assign to the dest_node_input property of this CreateAgentFlowEdgeDetails.
        :type dest_node_input: str

        :param parent_node_id:
            The value to assign to the parent_node_id property of this CreateAgentFlowEdgeDetails.
        :type parent_node_id: str

        :param edge_handles:
            The value to assign to the edge_handles property of this CreateAgentFlowEdgeDetails.
        :type edge_handles: list[oci.aidataplatform_dp.models.Point]

        :param edge_type:
            The value to assign to the edge_type property of this CreateAgentFlowEdgeDetails.
        :type edge_type: str

        """
        self.swagger_types = {
            'src_node_id': 'str',
            'dest_node_id': 'str',
            'src_node_output': 'str',
            'dest_node_input': 'str',
            'parent_node_id': 'str',
            'edge_handles': 'list[Point]',
            'edge_type': 'str'
        }

        self.attribute_map = {
            'src_node_id': 'srcNodeId',
            'dest_node_id': 'destNodeId',
            'src_node_output': 'srcNodeOutput',
            'dest_node_input': 'destNodeInput',
            'parent_node_id': 'parentNodeId',
            'edge_handles': 'edgeHandles',
            'edge_type': 'edgeType'
        }

        self._src_node_id = None
        self._dest_node_id = None
        self._src_node_output = None
        self._dest_node_input = None
        self._parent_node_id = None
        self._edge_handles = None
        self._edge_type = None

    @property
    def src_node_id(self):
        """
        **[Required]** Gets the src_node_id of this CreateAgentFlowEdgeDetails.
        Source node for this edge.


        :return: The src_node_id of this CreateAgentFlowEdgeDetails.
        :rtype: str
        """
        return self._src_node_id

    @src_node_id.setter
    def src_node_id(self, src_node_id):
        """
        Sets the src_node_id of this CreateAgentFlowEdgeDetails.
        Source node for this edge.


        :param src_node_id: The src_node_id of this CreateAgentFlowEdgeDetails.
        :type: str
        """
        self._src_node_id = src_node_id

    @property
    def dest_node_id(self):
        """
        **[Required]** Gets the dest_node_id of this CreateAgentFlowEdgeDetails.
        Destination node for this edge.


        :return: The dest_node_id of this CreateAgentFlowEdgeDetails.
        :rtype: str
        """
        return self._dest_node_id

    @dest_node_id.setter
    def dest_node_id(self, dest_node_id):
        """
        Sets the dest_node_id of this CreateAgentFlowEdgeDetails.
        Destination node for this edge.


        :param dest_node_id: The dest_node_id of this CreateAgentFlowEdgeDetails.
        :type: str
        """
        self._dest_node_id = dest_node_id

    @property
    def src_node_output(self):
        """
        **[Required]** Gets the src_node_output of this CreateAgentFlowEdgeDetails.
        Output port on the source node.


        :return: The src_node_output of this CreateAgentFlowEdgeDetails.
        :rtype: str
        """
        return self._src_node_output

    @src_node_output.setter
    def src_node_output(self, src_node_output):
        """
        Sets the src_node_output of this CreateAgentFlowEdgeDetails.
        Output port on the source node.


        :param src_node_output: The src_node_output of this CreateAgentFlowEdgeDetails.
        :type: str
        """
        self._src_node_output = src_node_output

    @property
    def dest_node_input(self):
        """
        **[Required]** Gets the dest_node_input of this CreateAgentFlowEdgeDetails.
        Input port on the destination node.


        :return: The dest_node_input of this CreateAgentFlowEdgeDetails.
        :rtype: str
        """
        return self._dest_node_input

    @dest_node_input.setter
    def dest_node_input(self, dest_node_input):
        """
        Sets the dest_node_input of this CreateAgentFlowEdgeDetails.
        Input port on the destination node.


        :param dest_node_input: The dest_node_input of this CreateAgentFlowEdgeDetails.
        :type: str
        """
        self._dest_node_input = dest_node_input

    @property
    def parent_node_id(self):
        """
        Gets the parent_node_id of this CreateAgentFlowEdgeDetails.
        Parent node, if hierarchical.


        :return: The parent_node_id of this CreateAgentFlowEdgeDetails.
        :rtype: str
        """
        return self._parent_node_id

    @parent_node_id.setter
    def parent_node_id(self, parent_node_id):
        """
        Sets the parent_node_id of this CreateAgentFlowEdgeDetails.
        Parent node, if hierarchical.


        :param parent_node_id: The parent_node_id of this CreateAgentFlowEdgeDetails.
        :type: str
        """
        self._parent_node_id = parent_node_id

    @property
    def edge_handles(self):
        """
        Gets the edge_handles of this CreateAgentFlowEdgeDetails.
        Geometry handle coordinates.


        :return: The edge_handles of this CreateAgentFlowEdgeDetails.
        :rtype: list[oci.aidataplatform_dp.models.Point]
        """
        return self._edge_handles

    @edge_handles.setter
    def edge_handles(self, edge_handles):
        """
        Sets the edge_handles of this CreateAgentFlowEdgeDetails.
        Geometry handle coordinates.


        :param edge_handles: The edge_handles of this CreateAgentFlowEdgeDetails.
        :type: list[oci.aidataplatform_dp.models.Point]
        """
        self._edge_handles = edge_handles

    @property
    def edge_type(self):
        """
        Gets the edge_type of this CreateAgentFlowEdgeDetails.
        Style/type for edge.


        :return: The edge_type of this CreateAgentFlowEdgeDetails.
        :rtype: str
        """
        return self._edge_type

    @edge_type.setter
    def edge_type(self, edge_type):
        """
        Sets the edge_type of this CreateAgentFlowEdgeDetails.
        Style/type for edge.


        :param edge_type: The edge_type of this CreateAgentFlowEdgeDetails.
        :type: str
        """
        self._edge_type = edge_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
