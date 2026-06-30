# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class FetchLineageGraphNodeReferencesDetails(object):
    """
    The information needed to fetch child/parent nodes of desired lineage node details.
    """

    #: A constant which can be used with the reference_type property of a FetchLineageGraphNodeReferencesDetails.
    #: This constant has a value of "CHILD"
    REFERENCE_TYPE_CHILD = "CHILD"

    #: A constant which can be used with the reference_type property of a FetchLineageGraphNodeReferencesDetails.
    #: This constant has a value of "PARENT"
    REFERENCE_TYPE_PARENT = "PARENT"

    def __init__(self, **kwargs):
        """
        Initializes a new FetchLineageGraphNodeReferencesDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param node_id:
            The value to assign to the node_id property of this FetchLineageGraphNodeReferencesDetails.
        :type node_id: str

        :param reference_type:
            The value to assign to the reference_type property of this FetchLineageGraphNodeReferencesDetails.
            Allowed values for this property are: "CHILD", "PARENT"
        :type reference_type: str

        """
        self.swagger_types = {
            'node_id': 'str',
            'reference_type': 'str'
        }

        self.attribute_map = {
            'node_id': 'nodeId',
            'reference_type': 'referenceType'
        }

        self._node_id = None
        self._reference_type = None

    @property
    def node_id(self):
        """
        **[Required]** Gets the node_id of this FetchLineageGraphNodeReferencesDetails.
        ID of the node to fetch the details:


        :return: The node_id of this FetchLineageGraphNodeReferencesDetails.
        :rtype: str
        """
        return self._node_id

    @node_id.setter
    def node_id(self, node_id):
        """
        Sets the node_id of this FetchLineageGraphNodeReferencesDetails.
        ID of the node to fetch the details:


        :param node_id: The node_id of this FetchLineageGraphNodeReferencesDetails.
        :type: str
        """
        self._node_id = node_id

    @property
    def reference_type(self):
        """
        **[Required]** Gets the reference_type of this FetchLineageGraphNodeReferencesDetails.
        referenceType of the node

        Allowed values for this property are: "CHILD", "PARENT"


        :return: The reference_type of this FetchLineageGraphNodeReferencesDetails.
        :rtype: str
        """
        return self._reference_type

    @reference_type.setter
    def reference_type(self, reference_type):
        """
        Sets the reference_type of this FetchLineageGraphNodeReferencesDetails.
        referenceType of the node


        :param reference_type: The reference_type of this FetchLineageGraphNodeReferencesDetails.
        :type: str
        """
        allowed_values = ["CHILD", "PARENT"]
        if not value_allowed_none_or_none_sentinel(reference_type, allowed_values):
            raise ValueError(
                "Invalid value for `reference_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._reference_type = reference_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
