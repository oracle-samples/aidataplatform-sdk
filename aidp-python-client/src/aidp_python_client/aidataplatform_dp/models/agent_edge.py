# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentEdge(object):
    """
    An edge connecting two nodes in the diagram, with context and metadata.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentEdge object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param src_node_id:
            The value to assign to the src_node_id property of this AgentEdge.
        :type src_node_id: str

        :param dest_node_id:
            The value to assign to the dest_node_id property of this AgentEdge.
        :type dest_node_id: str

        :param src_node_output:
            The value to assign to the src_node_output property of this AgentEdge.
        :type src_node_output: str

        :param dest_node_input:
            The value to assign to the dest_node_input property of this AgentEdge.
        :type dest_node_input: str

        :param parent_node_id:
            The value to assign to the parent_node_id property of this AgentEdge.
        :type parent_node_id: str

        :param edge_handles:
            The value to assign to the edge_handles property of this AgentEdge.
        :type edge_handles: list[oci.aidataplatform_dp.models.Point]

        :param edge_properties:
            The value to assign to the edge_properties property of this AgentEdge.
        :type edge_properties: dict(str, object)

        :param edge_type:
            The value to assign to the edge_type property of this AgentEdge.
        :type edge_type: str

        :param key:
            The value to assign to the key property of this AgentEdge.
        :type key: str

        :param time_created:
            The value to assign to the time_created property of this AgentEdge.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this AgentEdge.
        :type time_updated: datetime

        :param validation_errors:
            The value to assign to the validation_errors property of this AgentEdge.
        :type validation_errors: list[oci.aidataplatform_dp.models.ValidationError]

        """
        self.swagger_types = {
            'src_node_id': 'str',
            'dest_node_id': 'str',
            'src_node_output': 'str',
            'dest_node_input': 'str',
            'parent_node_id': 'str',
            'edge_handles': 'list[Point]',
            'edge_properties': 'dict(str, object)',
            'edge_type': 'str',
            'key': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'validation_errors': 'list[ValidationError]'
        }

        self.attribute_map = {
            'src_node_id': 'srcNodeId',
            'dest_node_id': 'destNodeId',
            'src_node_output': 'srcNodeOutput',
            'dest_node_input': 'destNodeInput',
            'parent_node_id': 'parentNodeId',
            'edge_handles': 'edgeHandles',
            'edge_properties': 'edgeProperties',
            'edge_type': 'edgeType',
            'key': 'key',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'validation_errors': 'validationErrors'
        }

        self._src_node_id = None
        self._dest_node_id = None
        self._src_node_output = None
        self._dest_node_input = None
        self._parent_node_id = None
        self._edge_handles = None
        self._edge_properties = None
        self._edge_type = None
        self._key = None
        self._time_created = None
        self._time_updated = None
        self._validation_errors = None

    @property
    def src_node_id(self):
        """
        **[Required]** Gets the src_node_id of this AgentEdge.
        Source node for this edge.


        :return: The src_node_id of this AgentEdge.
        :rtype: str
        """
        return self._src_node_id

    @src_node_id.setter
    def src_node_id(self, src_node_id):
        """
        Sets the src_node_id of this AgentEdge.
        Source node for this edge.


        :param src_node_id: The src_node_id of this AgentEdge.
        :type: str
        """
        self._src_node_id = src_node_id

    @property
    def dest_node_id(self):
        """
        **[Required]** Gets the dest_node_id of this AgentEdge.
        Destination node for this edge.


        :return: The dest_node_id of this AgentEdge.
        :rtype: str
        """
        return self._dest_node_id

    @dest_node_id.setter
    def dest_node_id(self, dest_node_id):
        """
        Sets the dest_node_id of this AgentEdge.
        Destination node for this edge.


        :param dest_node_id: The dest_node_id of this AgentEdge.
        :type: str
        """
        self._dest_node_id = dest_node_id

    @property
    def src_node_output(self):
        """
        **[Required]** Gets the src_node_output of this AgentEdge.
        Output port on the source node.


        :return: The src_node_output of this AgentEdge.
        :rtype: str
        """
        return self._src_node_output

    @src_node_output.setter
    def src_node_output(self, src_node_output):
        """
        Sets the src_node_output of this AgentEdge.
        Output port on the source node.


        :param src_node_output: The src_node_output of this AgentEdge.
        :type: str
        """
        self._src_node_output = src_node_output

    @property
    def dest_node_input(self):
        """
        **[Required]** Gets the dest_node_input of this AgentEdge.
        Input port on the destination node.


        :return: The dest_node_input of this AgentEdge.
        :rtype: str
        """
        return self._dest_node_input

    @dest_node_input.setter
    def dest_node_input(self, dest_node_input):
        """
        Sets the dest_node_input of this AgentEdge.
        Input port on the destination node.


        :param dest_node_input: The dest_node_input of this AgentEdge.
        :type: str
        """
        self._dest_node_input = dest_node_input

    @property
    def parent_node_id(self):
        """
        Gets the parent_node_id of this AgentEdge.
        Parent node, if hierarchical.


        :return: The parent_node_id of this AgentEdge.
        :rtype: str
        """
        return self._parent_node_id

    @parent_node_id.setter
    def parent_node_id(self, parent_node_id):
        """
        Sets the parent_node_id of this AgentEdge.
        Parent node, if hierarchical.


        :param parent_node_id: The parent_node_id of this AgentEdge.
        :type: str
        """
        self._parent_node_id = parent_node_id

    @property
    def edge_handles(self):
        """
        Gets the edge_handles of this AgentEdge.
        Geometry handle coordinates.


        :return: The edge_handles of this AgentEdge.
        :rtype: list[oci.aidataplatform_dp.models.Point]
        """
        return self._edge_handles

    @edge_handles.setter
    def edge_handles(self, edge_handles):
        """
        Sets the edge_handles of this AgentEdge.
        Geometry handle coordinates.


        :param edge_handles: The edge_handles of this AgentEdge.
        :type: list[oci.aidataplatform_dp.models.Point]
        """
        self._edge_handles = edge_handles

    @property
    def edge_properties(self):
        """
        Gets the edge_properties of this AgentEdge.
        Extensible properties of the edge.


        :return: The edge_properties of this AgentEdge.
        :rtype: dict(str, object)
        """
        return self._edge_properties

    @edge_properties.setter
    def edge_properties(self, edge_properties):
        """
        Sets the edge_properties of this AgentEdge.
        Extensible properties of the edge.


        :param edge_properties: The edge_properties of this AgentEdge.
        :type: dict(str, object)
        """
        self._edge_properties = edge_properties

    @property
    def edge_type(self):
        """
        Gets the edge_type of this AgentEdge.
        Style/type for edge.


        :return: The edge_type of this AgentEdge.
        :rtype: str
        """
        return self._edge_type

    @edge_type.setter
    def edge_type(self, edge_type):
        """
        Sets the edge_type of this AgentEdge.
        Style/type for edge.


        :param edge_type: The edge_type of this AgentEdge.
        :type: str
        """
        self._edge_type = edge_type

    @property
    def key(self):
        """
        **[Required]** Gets the key of this AgentEdge.
        Unique edge identifier.


        :return: The key of this AgentEdge.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this AgentEdge.
        Unique edge identifier.


        :param key: The key of this AgentEdge.
        :type: str
        """
        self._key = key

    @property
    def time_created(self):
        """
        Gets the time_created of this AgentEdge.
        RFC3339 timestamp when edge was created.


        :return: The time_created of this AgentEdge.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this AgentEdge.
        RFC3339 timestamp when edge was created.


        :param time_created: The time_created of this AgentEdge.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this AgentEdge.
        RFC3339 timestamp when edge was last updated.


        :return: The time_updated of this AgentEdge.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this AgentEdge.
        RFC3339 timestamp when edge was last updated.


        :param time_updated: The time_updated of this AgentEdge.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def validation_errors(self):
        """
        Gets the validation_errors of this AgentEdge.
        List of validation errors encountered in the diagram.


        :return: The validation_errors of this AgentEdge.
        :rtype: list[oci.aidataplatform_dp.models.ValidationError]
        """
        return self._validation_errors

    @validation_errors.setter
    def validation_errors(self, validation_errors):
        """
        Sets the validation_errors of this AgentEdge.
        List of validation errors encountered in the diagram.


        :param validation_errors: The validation_errors of this AgentEdge.
        :type: list[oci.aidataplatform_dp.models.ValidationError]
        """
        self._validation_errors = validation_errors

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
