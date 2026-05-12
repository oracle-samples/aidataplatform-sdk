# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class NodeInput(object):
    """
    An input slot for a node, including type and requirements.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new NodeInput object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this NodeInput.
        :type name: str

        :param type:
            The value to assign to the type property of this NodeInput.
        :type type: oci.aidataplatform_dp.models.NodeIo

        :param description:
            The value to assign to the description property of this NodeInput.
        :type description: str

        :param is_required:
            The value to assign to the is_required property of this NodeInput.
        :type is_required: bool

        :param is_single_connection:
            The value to assign to the is_single_connection property of this NodeInput.
        :type is_single_connection: bool

        """
        self.swagger_types = {
            'name': 'str',
            'type': 'NodeIo',
            'description': 'str',
            'is_required': 'bool',
            'is_single_connection': 'bool'
        }

        self.attribute_map = {
            'name': 'name',
            'type': 'type',
            'description': 'description',
            'is_required': 'isRequired',
            'is_single_connection': 'isSingleConnection'
        }

        self._name = None
        self._type = None
        self._description = None
        self._is_required = None
        self._is_single_connection = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this NodeInput.
        Unique name for the input slot.


        :return: The name of this NodeInput.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this NodeInput.
        Unique name for the input slot.


        :param name: The name of this NodeInput.
        :type: str
        """
        self._name = name

    @property
    def type(self):
        """
        **[Required]** Gets the type of this NodeInput.

        :return: The type of this NodeInput.
        :rtype: oci.aidataplatform_dp.models.NodeIo
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this NodeInput.

        :param type: The type of this NodeInput.
        :type: oci.aidataplatform_dp.models.NodeIo
        """
        self._type = type

    @property
    def description(self):
        """
        Gets the description of this NodeInput.
        Documentation or tooltip shown in the UI.


        :return: The description of this NodeInput.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this NodeInput.
        Documentation or tooltip shown in the UI.


        :param description: The description of this NodeInput.
        :type: str
        """
        self._description = description

    @property
    def is_required(self):
        """
        **[Required]** Gets the is_required of this NodeInput.
        True if this input is mandatory.


        :return: The is_required of this NodeInput.
        :rtype: bool
        """
        return self._is_required

    @is_required.setter
    def is_required(self, is_required):
        """
        Sets the is_required of this NodeInput.
        True if this input is mandatory.


        :param is_required: The is_required of this NodeInput.
        :type: bool
        """
        self._is_required = is_required

    @property
    def is_single_connection(self):
        """
        Gets the is_single_connection of this NodeInput.
        True if only one connection is allowed; false allows multiple.


        :return: The is_single_connection of this NodeInput.
        :rtype: bool
        """
        return self._is_single_connection

    @is_single_connection.setter
    def is_single_connection(self, is_single_connection):
        """
        Sets the is_single_connection of this NodeInput.
        True if only one connection is allowed; false allows multiple.


        :param is_single_connection: The is_single_connection of this NodeInput.
        :type: bool
        """
        self._is_single_connection = is_single_connection

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
