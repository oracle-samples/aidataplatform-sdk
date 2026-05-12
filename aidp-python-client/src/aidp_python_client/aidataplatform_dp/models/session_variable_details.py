# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SessionVariableDetails(object):
    """
    Session Variable Details.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SessionVariableDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this SessionVariableDetails.
        :type name: str

        :param description:
            The value to assign to the description property of this SessionVariableDetails.
        :type description: str

        :param is_required:
            The value to assign to the is_required property of this SessionVariableDetails.
        :type is_required: bool

        :param should_log:
            The value to assign to the should_log property of this SessionVariableDetails.
        :type should_log: bool

        :param is_system:
            The value to assign to the is_system property of this SessionVariableDetails.
        :type is_system: bool

        :param value:
            The value to assign to the value property of this SessionVariableDetails.
        :type value: str

        """
        self.swagger_types = {
            'name': 'str',
            'description': 'str',
            'is_required': 'bool',
            'should_log': 'bool',
            'is_system': 'bool',
            'value': 'str'
        }

        self.attribute_map = {
            'name': 'name',
            'description': 'description',
            'is_required': 'isRequired',
            'should_log': 'shouldLog',
            'is_system': 'isSystem',
            'value': 'value'
        }

        self._name = None
        self._description = None
        self._is_required = None
        self._should_log = None
        self._is_system = None
        self._value = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this SessionVariableDetails.
        Name of the Session Variable.


        :return: The name of this SessionVariableDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this SessionVariableDetails.
        Name of the Session Variable.


        :param name: The name of this SessionVariableDetails.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this SessionVariableDetails.
        Description of the Session Variable


        :return: The description of this SessionVariableDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this SessionVariableDetails.
        Description of the Session Variable


        :param description: The description of this SessionVariableDetails.
        :type: str
        """
        self._description = description

    @property
    def is_required(self):
        """
        Gets the is_required of this SessionVariableDetails.
        If this Variable is required or not


        :return: The is_required of this SessionVariableDetails.
        :rtype: bool
        """
        return self._is_required

    @is_required.setter
    def is_required(self, is_required):
        """
        Sets the is_required of this SessionVariableDetails.
        If this Variable is required or not


        :param is_required: The is_required of this SessionVariableDetails.
        :type: bool
        """
        self._is_required = is_required

    @property
    def should_log(self):
        """
        Gets the should_log of this SessionVariableDetails.
        If we should log this Session Variable or not


        :return: The should_log of this SessionVariableDetails.
        :rtype: bool
        """
        return self._should_log

    @should_log.setter
    def should_log(self, should_log):
        """
        Sets the should_log of this SessionVariableDetails.
        If we should log this Session Variable or not


        :param should_log: The should_log of this SessionVariableDetails.
        :type: bool
        """
        self._should_log = should_log

    @property
    def is_system(self):
        """
        Gets the is_system of this SessionVariableDetails.
        True if Session Variable is defined by System


        :return: The is_system of this SessionVariableDetails.
        :rtype: bool
        """
        return self._is_system

    @is_system.setter
    def is_system(self, is_system):
        """
        Sets the is_system of this SessionVariableDetails.
        True if Session Variable is defined by System


        :param is_system: The is_system of this SessionVariableDetails.
        :type: bool
        """
        self._is_system = is_system

    @property
    def value(self):
        """
        Gets the value of this SessionVariableDetails.
        Default Value of this Session Variable


        :return: The value of this SessionVariableDetails.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """
        Sets the value of this SessionVariableDetails.
        Default Value of this Session Variable


        :param value: The value of this SessionVariableDetails.
        :type: str
        """
        self._value = value

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
