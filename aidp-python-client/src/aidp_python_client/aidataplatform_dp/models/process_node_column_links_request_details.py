# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ProcessNodeColumnLinksRequestDetails(object):
    """
    Details needed by a fetchProcessNodeColumnLinks request.
    """

    #: A constant which can be used with the direction property of a ProcessNodeColumnLinksRequestDetails.
    #: This constant has a value of "UPSTREAM"
    DIRECTION_UPSTREAM = "UPSTREAM"

    #: A constant which can be used with the direction property of a ProcessNodeColumnLinksRequestDetails.
    #: This constant has a value of "BOTH"
    DIRECTION_BOTH = "BOTH"

    #: A constant which can be used with the direction property of a ProcessNodeColumnLinksRequestDetails.
    #: This constant has a value of "DOWNSTREAM"
    DIRECTION_DOWNSTREAM = "DOWNSTREAM"

    def __init__(self, **kwargs):
        """
        Initializes a new ProcessNodeColumnLinksRequestDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param anchor_node_id:
            The value to assign to the anchor_node_id property of this ProcessNodeColumnLinksRequestDetails.
        :type anchor_node_id: str

        :param process_node_id:
            The value to assign to the process_node_id property of this ProcessNodeColumnLinksRequestDetails.
        :type process_node_id: str

        :param process_depth:
            The value to assign to the process_depth property of this ProcessNodeColumnLinksRequestDetails.
        :type process_depth: int

        :param direction:
            The value to assign to the direction property of this ProcessNodeColumnLinksRequestDetails.
            Allowed values for this property are: "UPSTREAM", "BOTH", "DOWNSTREAM"
        :type direction: str

        :param filter:
            The value to assign to the filter property of this ProcessNodeColumnLinksRequestDetails.
        :type filter: oci.aidataplatform_dp.models.ProcessNodeColumnLinksFilter

        """
        self.swagger_types = {
            'anchor_node_id': 'str',
            'process_node_id': 'str',
            'process_depth': 'int',
            'direction': 'str',
            'filter': 'ProcessNodeColumnLinksFilter'
        }

        self.attribute_map = {
            'anchor_node_id': 'anchorNodeId',
            'process_node_id': 'processNodeId',
            'process_depth': 'processDepth',
            'direction': 'direction',
            'filter': 'filter'
        }

        self._anchor_node_id = None
        self._process_node_id = None
        self._process_depth = None
        self._direction = None
        self._filter = None

    @property
    def anchor_node_id(self):
        """
        **[Required]** Gets the anchor_node_id of this ProcessNodeColumnLinksRequestDetails.
        ID of the lineage anchor node from which the traversal context is derived.


        :return: The anchor_node_id of this ProcessNodeColumnLinksRequestDetails.
        :rtype: str
        """
        return self._anchor_node_id

    @anchor_node_id.setter
    def anchor_node_id(self, anchor_node_id):
        """
        Sets the anchor_node_id of this ProcessNodeColumnLinksRequestDetails.
        ID of the lineage anchor node from which the traversal context is derived.


        :param anchor_node_id: The anchor_node_id of this ProcessNodeColumnLinksRequestDetails.
        :type: str
        """
        self._anchor_node_id = anchor_node_id

    @property
    def process_node_id(self):
        """
        **[Required]** Gets the process_node_id of this ProcessNodeColumnLinksRequestDetails.
        ID of process node for which column transformation links are requested.


        :return: The process_node_id of this ProcessNodeColumnLinksRequestDetails.
        :rtype: str
        """
        return self._process_node_id

    @process_node_id.setter
    def process_node_id(self, process_node_id):
        """
        Sets the process_node_id of this ProcessNodeColumnLinksRequestDetails.
        ID of process node for which column transformation links are requested.


        :param process_node_id: The process_node_id of this ProcessNodeColumnLinksRequestDetails.
        :type: str
        """
        self._process_node_id = process_node_id

    @property
    def process_depth(self):
        """
        **[Required]** Gets the process_depth of this ProcessNodeColumnLinksRequestDetails.
        Depth of the process node relative to the anchor node within the lineage traversal.


        :return: The process_depth of this ProcessNodeColumnLinksRequestDetails.
        :rtype: int
        """
        return self._process_depth

    @process_depth.setter
    def process_depth(self, process_depth):
        """
        Sets the process_depth of this ProcessNodeColumnLinksRequestDetails.
        Depth of the process node relative to the anchor node within the lineage traversal.


        :param process_depth: The process_depth of this ProcessNodeColumnLinksRequestDetails.
        :type: int
        """
        self._process_depth = process_depth

    @property
    def direction(self):
        """
        **[Required]** Gets the direction of this ProcessNodeColumnLinksRequestDetails.
        Direction of the process node with respect to Anchor node.

        Allowed values for this property are: "UPSTREAM", "BOTH", "DOWNSTREAM"


        :return: The direction of this ProcessNodeColumnLinksRequestDetails.
        :rtype: str
        """
        return self._direction

    @direction.setter
    def direction(self, direction):
        """
        Sets the direction of this ProcessNodeColumnLinksRequestDetails.
        Direction of the process node with respect to Anchor node.


        :param direction: The direction of this ProcessNodeColumnLinksRequestDetails.
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
    def filter(self):
        """
        Gets the filter of this ProcessNodeColumnLinksRequestDetails.

        :return: The filter of this ProcessNodeColumnLinksRequestDetails.
        :rtype: oci.aidataplatform_dp.models.ProcessNodeColumnLinksFilter
        """
        return self._filter

    @filter.setter
    def filter(self, filter):
        """
        Sets the filter of this ProcessNodeColumnLinksRequestDetails.

        :param filter: The filter of this ProcessNodeColumnLinksRequestDetails.
        :type: oci.aidataplatform_dp.models.ProcessNodeColumnLinksFilter
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
