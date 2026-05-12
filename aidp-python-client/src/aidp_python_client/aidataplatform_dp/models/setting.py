# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Setting(object):
    """
    Setting details
    """

    def __init__(self, **kwargs):
        """
        Initializes a new Setting object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this Setting.
        :type key: str

        :param name:
            The value to assign to the name property of this Setting.
        :type name: str

        :param is_default:
            The value to assign to the is_default property of this Setting.
        :type is_default: bool

        :param data:
            The value to assign to the data property of this Setting.
        :type data: oci.aidataplatform_dp.models.SettingData

        """
        self.swagger_types = {
            'key': 'str',
            'name': 'str',
            'is_default': 'bool',
            'data': 'SettingData'
        }

        self.attribute_map = {
            'key': 'key',
            'name': 'name',
            'is_default': 'isDefault',
            'data': 'data'
        }

        self._key = None
        self._name = None
        self._is_default = None
        self._data = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this Setting.
        The unique identifier for the setting.


        :return: The key of this Setting.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this Setting.
        The unique identifier for the setting.


        :param key: The key of this Setting.
        :type: str
        """
        self._key = key

    @property
    def name(self):
        """
        **[Required]** Gets the name of this Setting.
        A user-friendly name for the setting.


        :return: The name of this Setting.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this Setting.
        A user-friendly name for the setting.


        :param name: The name of this Setting.
        :type: str
        """
        self._name = name

    @property
    def is_default(self):
        """
        **[Required]** Gets the is_default of this Setting.
        Indicates whether this setting is the default.


        :return: The is_default of this Setting.
        :rtype: bool
        """
        return self._is_default

    @is_default.setter
    def is_default(self, is_default):
        """
        Sets the is_default of this Setting.
        Indicates whether this setting is the default.


        :param is_default: The is_default of this Setting.
        :type: bool
        """
        self._is_default = is_default

    @property
    def data(self):
        """
        Gets the data of this Setting.

        :return: The data of this Setting.
        :rtype: oci.aidataplatform_dp.models.SettingData
        """
        return self._data

    @data.setter
    def data(self, data):
        """
        Sets the data of this Setting.

        :param data: The data of this Setting.
        :type: oci.aidataplatform_dp.models.SettingData
        """
        self._data = data

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
