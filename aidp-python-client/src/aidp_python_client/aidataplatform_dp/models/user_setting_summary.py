# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UserSettingSummary(object):
    """
    Summary of Setting
    """

    #: A constant which can be used with the type property of a UserSettingSummary.
    #: This constant has a value of "IAM_USER_CREDENTIAL"
    TYPE_IAM_USER_CREDENTIAL = "IAM_USER_CREDENTIAL"

    #: A constant which can be used with the type property of a UserSettingSummary.
    #: This constant has a value of "GIT_ACCOUNT"
    TYPE_GIT_ACCOUNT = "GIT_ACCOUNT"

    #: A constant which can be used with the type property of a UserSettingSummary.
    #: This constant has a value of "OAUTH"
    TYPE_OAUTH = "OAUTH"

    def __init__(self, **kwargs):
        """
        Initializes a new UserSettingSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this UserSettingSummary.
        :type key: str

        :param name:
            The value to assign to the name property of this UserSettingSummary.
        :type name: str

        :param type:
            The value to assign to the type property of this UserSettingSummary.
            Allowed values for this property are: "IAM_USER_CREDENTIAL", "GIT_ACCOUNT", "OAUTH", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param is_default:
            The value to assign to the is_default property of this UserSettingSummary.
        :type is_default: bool

        :param time_created:
            The value to assign to the time_created property of this UserSettingSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this UserSettingSummary.
        :type time_updated: datetime

        :param properties:
            The value to assign to the properties property of this UserSettingSummary.
        :type properties: dict(str, object)

        """
        self.swagger_types = {
            'key': 'str',
            'name': 'str',
            'type': 'str',
            'is_default': 'bool',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'properties': 'dict(str, object)'
        }

        self.attribute_map = {
            'key': 'key',
            'name': 'name',
            'type': 'type',
            'is_default': 'isDefault',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'properties': 'properties'
        }

        self._key = None
        self._name = None
        self._type = None
        self._is_default = None
        self._time_created = None
        self._time_updated = None
        self._properties = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this UserSettingSummary.
        The unique identifier for the setting.


        :return: The key of this UserSettingSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this UserSettingSummary.
        The unique identifier for the setting.


        :param key: The key of this UserSettingSummary.
        :type: str
        """
        self._key = key

    @property
    def name(self):
        """
        **[Required]** Gets the name of this UserSettingSummary.
        A user-friendly name for the setting.


        :return: The name of this UserSettingSummary.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this UserSettingSummary.
        A user-friendly name for the setting.


        :param name: The name of this UserSettingSummary.
        :type: str
        """
        self._name = name

    @property
    def type(self):
        """
        **[Required]** Gets the type of this UserSettingSummary.
        Setting data type discriminator

        Allowed values for this property are: "IAM_USER_CREDENTIAL", "GIT_ACCOUNT", "OAUTH", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this UserSettingSummary.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this UserSettingSummary.
        Setting data type discriminator


        :param type: The type of this UserSettingSummary.
        :type: str
        """
        allowed_values = ["IAM_USER_CREDENTIAL", "GIT_ACCOUNT", "OAUTH"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def is_default(self):
        """
        **[Required]** Gets the is_default of this UserSettingSummary.
        Indicates whether this setting is the default.


        :return: The is_default of this UserSettingSummary.
        :rtype: bool
        """
        return self._is_default

    @is_default.setter
    def is_default(self, is_default):
        """
        Sets the is_default of this UserSettingSummary.
        Indicates whether this setting is the default.


        :param is_default: The is_default of this UserSettingSummary.
        :type: bool
        """
        self._is_default = is_default

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this UserSettingSummary.
        The date and time when the setting was created.


        :return: The time_created of this UserSettingSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this UserSettingSummary.
        The date and time when the setting was created.


        :param time_created: The time_created of this UserSettingSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        **[Required]** Gets the time_updated of this UserSettingSummary.
        The date and time when the setting was most recently updated.


        :return: The time_updated of this UserSettingSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this UserSettingSummary.
        The date and time when the setting was most recently updated.


        :param time_updated: The time_updated of this UserSettingSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def properties(self):
        """
        Gets the properties of this UserSettingSummary.
        A generic property bag associated with the setting resource


        :return: The properties of this UserSettingSummary.
        :rtype: dict(str, object)
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """
        Sets the properties of this UserSettingSummary.
        A generic property bag associated with the setting resource


        :param properties: The properties of this UserSettingSummary.
        :type: dict(str, object)
        """
        self._properties = properties

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
