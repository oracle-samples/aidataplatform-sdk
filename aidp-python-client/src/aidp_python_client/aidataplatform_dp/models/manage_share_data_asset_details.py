# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageShareDataAssetDetails(object):
    """
    Information to update data assets on a share.
    """

    #: A constant which can be used with the action property of a ManageShareDataAssetDetails.
    #: This constant has a value of "ADD"
    ACTION_ADD = "ADD"

    #: A constant which can be used with the action property of a ManageShareDataAssetDetails.
    #: This constant has a value of "REMOVE"
    ACTION_REMOVE = "REMOVE"

    #: A constant which can be used with the type property of a ManageShareDataAssetDetails.
    #: This constant has a value of "SCHEMA"
    TYPE_SCHEMA = "SCHEMA"

    #: A constant which can be used with the type property of a ManageShareDataAssetDetails.
    #: This constant has a value of "TABLE"
    TYPE_TABLE = "TABLE"

    #: A constant which can be used with the type property of a ManageShareDataAssetDetails.
    #: This constant has a value of "VIEW"
    TYPE_VIEW = "VIEW"

    def __init__(self, **kwargs):
        """
        Initializes a new ManageShareDataAssetDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param action:
            The value to assign to the action property of this ManageShareDataAssetDetails.
            Allowed values for this property are: "ADD", "REMOVE"
        :type action: str

        :param type:
            The value to assign to the type property of this ManageShareDataAssetDetails.
            Allowed values for this property are: "SCHEMA", "TABLE", "VIEW"
        :type type: str

        :param name:
            The value to assign to the name property of this ManageShareDataAssetDetails.
        :type name: str

        :param description:
            The value to assign to the description property of this ManageShareDataAssetDetails.
        :type description: str

        :param partition:
            The value to assign to the partition property of this ManageShareDataAssetDetails.
        :type partition: str

        :param alias:
            The value to assign to the alias property of this ManageShareDataAssetDetails.
        :type alias: str

        """
        self.swagger_types = {
            'action': 'str',
            'type': 'str',
            'name': 'str',
            'description': 'str',
            'partition': 'str',
            'alias': 'str'
        }

        self.attribute_map = {
            'action': 'action',
            'type': 'type',
            'name': 'name',
            'description': 'description',
            'partition': 'partition',
            'alias': 'alias'
        }

        self._action = None
        self._type = None
        self._name = None
        self._description = None
        self._partition = None
        self._alias = None

    @property
    def action(self):
        """
        **[Required]** Gets the action of this ManageShareDataAssetDetails.
        The action of this update.

        Allowed values for this property are: "ADD", "REMOVE"


        :return: The action of this ManageShareDataAssetDetails.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action):
        """
        Sets the action of this ManageShareDataAssetDetails.
        The action of this update.


        :param action: The action of this ManageShareDataAssetDetails.
        :type: str
        """
        allowed_values = ["ADD", "REMOVE"]
        if not value_allowed_none_or_none_sentinel(action, allowed_values):
            raise ValueError(
                "Invalid value for `action`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._action = action

    @property
    def type(self):
        """
        **[Required]** Gets the type of this ManageShareDataAssetDetails.
        The asset type for this update.

        Allowed values for this property are: "SCHEMA", "TABLE", "VIEW"


        :return: The type of this ManageShareDataAssetDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this ManageShareDataAssetDetails.
        The asset type for this update.


        :param type: The type of this ManageShareDataAssetDetails.
        :type: str
        """
        allowed_values = ["SCHEMA", "TABLE", "VIEW"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    @property
    def name(self):
        """
        **[Required]** Gets the name of this ManageShareDataAssetDetails.
        The data asset name for this operation. For relational assets, it should be fully qualified name. For example, catalog.schema or catalog.schema.table.


        :return: The name of this ManageShareDataAssetDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this ManageShareDataAssetDetails.
        The data asset name for this operation. For relational assets, it should be fully qualified name. For example, catalog.schema or catalog.schema.table.


        :param name: The name of this ManageShareDataAssetDetails.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this ManageShareDataAssetDetails.
        The data asset description for this operation.


        :return: The description of this ManageShareDataAssetDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this ManageShareDataAssetDetails.
        The data asset description for this operation.


        :param description: The description of this ManageShareDataAssetDetails.
        :type: str
        """
        self._description = description

    @property
    def partition(self):
        """
        Gets the partition of this ManageShareDataAssetDetails.
        Partition clause information, only applicable for TABLE.


        :return: The partition of this ManageShareDataAssetDetails.
        :rtype: str
        """
        return self._partition

    @partition.setter
    def partition(self, partition):
        """
        Sets the partition of this ManageShareDataAssetDetails.
        Partition clause information, only applicable for TABLE.


        :param partition: The partition of this ManageShareDataAssetDetails.
        :type: str
        """
        self._partition = partition

    @property
    def alias(self):
        """
        Gets the alias of this ManageShareDataAssetDetails.
        The data asset alias for this operation, only applicable for TABLE and VIEW.


        :return: The alias of this ManageShareDataAssetDetails.
        :rtype: str
        """
        return self._alias

    @alias.setter
    def alias(self, alias):
        """
        Sets the alias of this ManageShareDataAssetDetails.
        The data asset alias for this operation, only applicable for TABLE and VIEW.


        :param alias: The alias of this ManageShareDataAssetDetails.
        :type: str
        """
        self._alias = alias

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
