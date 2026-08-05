# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class FetchEntityLineageDetails(object):
    """
    The information needed to obtain desired lineage.
    """

    #: A constant which can be used with the level property of a FetchEntityLineageDetails.
    #: This constant has a value of "ENTITY"
    LEVEL_ENTITY = "ENTITY"

    #: A constant which can be used with the level property of a FetchEntityLineageDetails.
    #: This constant has a value of "COLUMN"
    LEVEL_COLUMN = "COLUMN"

    #: A constant which can be used with the direction property of a FetchEntityLineageDetails.
    #: This constant has a value of "UPSTREAM"
    DIRECTION_UPSTREAM = "UPSTREAM"

    #: A constant which can be used with the direction property of a FetchEntityLineageDetails.
    #: This constant has a value of "BOTH"
    DIRECTION_BOTH = "BOTH"

    #: A constant which can be used with the direction property of a FetchEntityLineageDetails.
    #: This constant has a value of "DOWNSTREAM"
    DIRECTION_DOWNSTREAM = "DOWNSTREAM"

    def __init__(self, **kwargs):
        """
        Initializes a new FetchEntityLineageDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param anchor_node:
            The value to assign to the anchor_node property of this FetchEntityLineageDetails.
        :type anchor_node: str

        :param max_depth:
            The value to assign to the max_depth property of this FetchEntityLineageDetails.
        :type max_depth: int

        :param level:
            The value to assign to the level property of this FetchEntityLineageDetails.
            Allowed values for this property are: "ENTITY", "COLUMN"
        :type level: str

        :param direction:
            The value to assign to the direction property of this FetchEntityLineageDetails.
            Allowed values for this property are: "UPSTREAM", "BOTH", "DOWNSTREAM"
        :type direction: str

        :param node_filters:
            The value to assign to the node_filters property of this FetchEntityLineageDetails.
        :type node_filters: oci.aidataplatform_dp.models.NodeFilterObject

        :param path_filters:
            The value to assign to the path_filters property of this FetchEntityLineageDetails.
        :type path_filters: oci.aidataplatform_dp.models.PathFilterObject

        :param should_include_edges:
            The value to assign to the should_include_edges property of this FetchEntityLineageDetails.
        :type should_include_edges: bool

        """
        self.swagger_types = {
            'anchor_node': 'str',
            'max_depth': 'int',
            'level': 'str',
            'direction': 'str',
            'node_filters': 'NodeFilterObject',
            'path_filters': 'PathFilterObject',
            'should_include_edges': 'bool'
        }

        self.attribute_map = {
            'anchor_node': 'anchorNode',
            'max_depth': 'maxDepth',
            'level': 'level',
            'direction': 'direction',
            'node_filters': 'nodeFilters',
            'path_filters': 'pathFilters',
            'should_include_edges': 'shouldIncludeEdges'
        }

        self._anchor_node = None
        self._max_depth = None
        self._level = None
        self._direction = None
        self._node_filters = None
        self._path_filters = None
        self._should_include_edges = None

    @property
    def anchor_node(self):
        """
        **[Required]** Gets the anchor_node of this FetchEntityLineageDetails.
        Root entity node from with the lineage is to be fetched.


        :return: The anchor_node of this FetchEntityLineageDetails.
        :rtype: str
        """
        return self._anchor_node

    @anchor_node.setter
    def anchor_node(self, anchor_node):
        """
        Sets the anchor_node of this FetchEntityLineageDetails.
        Root entity node from with the lineage is to be fetched.


        :param anchor_node: The anchor_node of this FetchEntityLineageDetails.
        :type: str
        """
        self._anchor_node = anchor_node

    @property
    def max_depth(self):
        """
        **[Required]** Gets the max_depth of this FetchEntityLineageDetails.
        Maximum depth to traverse in lineage graph. Depth is measured as number of links from anchor node to matching nodes.


        :return: The max_depth of this FetchEntityLineageDetails.
        :rtype: int
        """
        return self._max_depth

    @max_depth.setter
    def max_depth(self, max_depth):
        """
        Sets the max_depth of this FetchEntityLineageDetails.
        Maximum depth to traverse in lineage graph. Depth is measured as number of links from anchor node to matching nodes.


        :param max_depth: The max_depth of this FetchEntityLineageDetails.
        :type: int
        """
        self._max_depth = max_depth

    @property
    def level(self):
        """
        **[Required]** Gets the level of this FetchEntityLineageDetails.
        Indicates the level for lineage fetch. It is one of ENTITY/COLUMN

        Allowed values for this property are: "ENTITY", "COLUMN"


        :return: The level of this FetchEntityLineageDetails.
        :rtype: str
        """
        return self._level

    @level.setter
    def level(self, level):
        """
        Sets the level of this FetchEntityLineageDetails.
        Indicates the level for lineage fetch. It is one of ENTITY/COLUMN


        :param level: The level of this FetchEntityLineageDetails.
        :type: str
        """
        allowed_values = ["ENTITY", "COLUMN"]
        if not value_allowed_none_or_none_sentinel(level, allowed_values):
            raise ValueError(
                "Invalid value for `level`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._level = level

    @property
    def direction(self):
        """
        **[Required]** Gets the direction of this FetchEntityLineageDetails.
        Direction of the lineage returned.

        Allowed values for this property are: "UPSTREAM", "BOTH", "DOWNSTREAM"


        :return: The direction of this FetchEntityLineageDetails.
        :rtype: str
        """
        return self._direction

    @direction.setter
    def direction(self, direction):
        """
        Sets the direction of this FetchEntityLineageDetails.
        Direction of the lineage returned.


        :param direction: The direction of this FetchEntityLineageDetails.
        :type: str
        """
        allowed_values = ["UPSTREAM", "BOTH", "DOWNSTREAM"]
        if not value_allowed_none_or_none_sentinel(direction, allowed_values):
            raise ValueError(
                "Invalid value for `direction`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._direction = direction

    @property
    def node_filters(self):
        """
        Gets the node_filters of this FetchEntityLineageDetails.

        :return: The node_filters of this FetchEntityLineageDetails.
        :rtype: oci.aidataplatform_dp.models.NodeFilterObject
        """
        return self._node_filters

    @node_filters.setter
    def node_filters(self, node_filters):
        """
        Sets the node_filters of this FetchEntityLineageDetails.

        :param node_filters: The node_filters of this FetchEntityLineageDetails.
        :type: oci.aidataplatform_dp.models.NodeFilterObject
        """
        self._node_filters = node_filters

    @property
    def path_filters(self):
        """
        Gets the path_filters of this FetchEntityLineageDetails.

        :return: The path_filters of this FetchEntityLineageDetails.
        :rtype: oci.aidataplatform_dp.models.PathFilterObject
        """
        return self._path_filters

    @path_filters.setter
    def path_filters(self, path_filters):
        """
        Sets the path_filters of this FetchEntityLineageDetails.

        :param path_filters: The path_filters of this FetchEntityLineageDetails.
        :type: oci.aidataplatform_dp.models.PathFilterObject
        """
        self._path_filters = path_filters

    @property
    def should_include_edges(self):
        """
        Gets the should_include_edges of this FetchEntityLineageDetails.
        Controls if the edges will be returned with vertices.


        :return: The should_include_edges of this FetchEntityLineageDetails.
        :rtype: bool
        """
        return self._should_include_edges

    @should_include_edges.setter
    def should_include_edges(self, should_include_edges):
        """
        Sets the should_include_edges of this FetchEntityLineageDetails.
        Controls if the edges will be returned with vertices.


        :param should_include_edges: The should_include_edges of this FetchEntityLineageDetails.
        :type: bool
        """
        self._should_include_edges = should_include_edges

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
