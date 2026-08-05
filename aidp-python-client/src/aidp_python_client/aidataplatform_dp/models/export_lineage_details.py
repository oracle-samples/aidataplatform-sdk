# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExportLineageDetails(object):
    """
    The information needed to export lineage as CSV.
    """

    #: A constant which can be used with the direction property of a ExportLineageDetails.
    #: This constant has a value of "UPSTREAM"
    DIRECTION_UPSTREAM = "UPSTREAM"

    #: A constant which can be used with the direction property of a ExportLineageDetails.
    #: This constant has a value of "BOTH"
    DIRECTION_BOTH = "BOTH"

    #: A constant which can be used with the direction property of a ExportLineageDetails.
    #: This constant has a value of "DOWNSTREAM"
    DIRECTION_DOWNSTREAM = "DOWNSTREAM"

    def __init__(self, **kwargs):
        """
        Initializes a new ExportLineageDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param anchor_node:
            The value to assign to the anchor_node property of this ExportLineageDetails.
        :type anchor_node: str

        :param direction:
            The value to assign to the direction property of this ExportLineageDetails.
            Allowed values for this property are: "UPSTREAM", "BOTH", "DOWNSTREAM"
        :type direction: str

        """
        self.swagger_types = {
            'anchor_node': 'str',
            'direction': 'str'
        }

        self.attribute_map = {
            'anchor_node': 'anchorNode',
            'direction': 'direction'
        }

        self._anchor_node = None
        self._direction = None

    @property
    def anchor_node(self):
        """
        **[Required]** Gets the anchor_node of this ExportLineageDetails.
        Root entity node from which lineage is to be exported.
        Example format: `aidp://catalogs@<aidpocid>/o/{catalog.db.table}`.


        :return: The anchor_node of this ExportLineageDetails.
        :rtype: str
        """
        return self._anchor_node

    @anchor_node.setter
    def anchor_node(self, anchor_node):
        """
        Sets the anchor_node of this ExportLineageDetails.
        Root entity node from which lineage is to be exported.
        Example format: `aidp://catalogs@<aidpocid>/o/{catalog.db.table}`.


        :param anchor_node: The anchor_node of this ExportLineageDetails.
        :type: str
        """
        self._anchor_node = anchor_node

    @property
    def direction(self):
        """
        **[Required]** Gets the direction of this ExportLineageDetails.
        Direction of the lineage returned.

        Allowed values for this property are: "UPSTREAM", "BOTH", "DOWNSTREAM"


        :return: The direction of this ExportLineageDetails.
        :rtype: str
        """
        return self._direction

    @direction.setter
    def direction(self, direction):
        """
        Sets the direction of this ExportLineageDetails.
        Direction of the lineage returned.


        :param direction: The direction of this ExportLineageDetails.
        :type: str
        """
        allowed_values = ["UPSTREAM", "BOTH", "DOWNSTREAM"]
        if not value_allowed_none_or_none_sentinel(direction, allowed_values):
            raise ValueError(
                "Invalid value for `direction`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._direction = direction

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
