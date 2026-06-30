# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class FetchLineageGraphNodeNeighborsDetails(object):
    """
    The information needed to obtain neighbors for the node.
    """

    #: A constant which can be used with the direction property of a FetchLineageGraphNodeNeighborsDetails.
    #: This constant has a value of "UPSTREAM"
    DIRECTION_UPSTREAM = "UPSTREAM"

    #: A constant which can be used with the direction property of a FetchLineageGraphNodeNeighborsDetails.
    #: This constant has a value of "BOTH"
    DIRECTION_BOTH = "BOTH"

    #: A constant which can be used with the direction property of a FetchLineageGraphNodeNeighborsDetails.
    #: This constant has a value of "DOWNSTREAM"
    DIRECTION_DOWNSTREAM = "DOWNSTREAM"

    def __init__(self, **kwargs):
        """
        Initializes a new FetchLineageGraphNodeNeighborsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param node_id:
            The value to assign to the node_id property of this FetchLineageGraphNodeNeighborsDetails.
        :type node_id: str

        :param direction:
            The value to assign to the direction property of this FetchLineageGraphNodeNeighborsDetails.
            Allowed values for this property are: "UPSTREAM", "BOTH", "DOWNSTREAM"
        :type direction: str

        :param is_with_columns:
            The value to assign to the is_with_columns property of this FetchLineageGraphNodeNeighborsDetails.
        :type is_with_columns: bool

        :param scoped_columns:
            The value to assign to the scoped_columns property of this FetchLineageGraphNodeNeighborsDetails.
        :type scoped_columns: list[str]

        :param filter:
            The value to assign to the filter property of this FetchLineageGraphNodeNeighborsDetails.
        :type filter: oci.aidataplatform_dp.models.LineageGraphNodeNeighborsFilter

        """
        self.swagger_types = {
            'node_id': 'str',
            'direction': 'str',
            'is_with_columns': 'bool',
            'scoped_columns': 'list[str]',
            'filter': 'LineageGraphNodeNeighborsFilter'
        }

        self.attribute_map = {
            'node_id': 'nodeId',
            'direction': 'direction',
            'is_with_columns': 'isWithColumns',
            'scoped_columns': 'scopedColumns',
            'filter': 'filter'
        }

        self._node_id = None
        self._direction = None
        self._is_with_columns = None
        self._scoped_columns = None
        self._filter = None

    @property
    def node_id(self):
        """
        **[Required]** Gets the node_id of this FetchLineageGraphNodeNeighborsDetails.
        ID of the node to fetch the details


        :return: The node_id of this FetchLineageGraphNodeNeighborsDetails.
        :rtype: str
        """
        return self._node_id

    @node_id.setter
    def node_id(self, node_id):
        """
        Sets the node_id of this FetchLineageGraphNodeNeighborsDetails.
        ID of the node to fetch the details


        :param node_id: The node_id of this FetchLineageGraphNodeNeighborsDetails.
        :type: str
        """
        self._node_id = node_id

    @property
    def direction(self):
        """
        **[Required]** Gets the direction of this FetchLineageGraphNodeNeighborsDetails.
        Direction of the lineage returned.

        Allowed values for this property are: "UPSTREAM", "BOTH", "DOWNSTREAM"


        :return: The direction of this FetchLineageGraphNodeNeighborsDetails.
        :rtype: str
        """
        return self._direction

    @direction.setter
    def direction(self, direction):
        """
        Sets the direction of this FetchLineageGraphNodeNeighborsDetails.
        Direction of the lineage returned.


        :param direction: The direction of this FetchLineageGraphNodeNeighborsDetails.
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
    def is_with_columns(self):
        """
        Gets the is_with_columns of this FetchLineageGraphNodeNeighborsDetails.
        The flag to indicate whether columns also to be included while fetching neighbors. Default is false.


        :return: The is_with_columns of this FetchLineageGraphNodeNeighborsDetails.
        :rtype: bool
        """
        return self._is_with_columns

    @is_with_columns.setter
    def is_with_columns(self, is_with_columns):
        """
        Sets the is_with_columns of this FetchLineageGraphNodeNeighborsDetails.
        The flag to indicate whether columns also to be included while fetching neighbors. Default is false.


        :param is_with_columns: The is_with_columns of this FetchLineageGraphNodeNeighborsDetails.
        :type: bool
        """
        self._is_with_columns = is_with_columns

    @property
    def scoped_columns(self):
        """
        Gets the scoped_columns of this FetchLineageGraphNodeNeighborsDetails.
        List of scoped column names for fetching the Graph Node Neighbors. Applicable only when isWithColumns is true.


        :return: The scoped_columns of this FetchLineageGraphNodeNeighborsDetails.
        :rtype: list[str]
        """
        return self._scoped_columns

    @scoped_columns.setter
    def scoped_columns(self, scoped_columns):
        """
        Sets the scoped_columns of this FetchLineageGraphNodeNeighborsDetails.
        List of scoped column names for fetching the Graph Node Neighbors. Applicable only when isWithColumns is true.


        :param scoped_columns: The scoped_columns of this FetchLineageGraphNodeNeighborsDetails.
        :type: list[str]
        """
        self._scoped_columns = scoped_columns

    @property
    def filter(self):
        """
        Gets the filter of this FetchLineageGraphNodeNeighborsDetails.

        :return: The filter of this FetchLineageGraphNodeNeighborsDetails.
        :rtype: oci.aidataplatform_dp.models.LineageGraphNodeNeighborsFilter
        """
        return self._filter

    @filter.setter
    def filter(self, filter):
        """
        Sets the filter of this FetchLineageGraphNodeNeighborsDetails.

        :param filter: The filter of this FetchLineageGraphNodeNeighborsDetails.
        :type: oci.aidataplatform_dp.models.LineageGraphNodeNeighborsFilter
        """
        self._filter = filter

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
