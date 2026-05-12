# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateSettingDetails(object):
    """
    Details of Creating Setting
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateSettingDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this CreateSettingDetails.
        :type name: str

        :param is_default:
            The value to assign to the is_default property of this CreateSettingDetails.
        :type is_default: bool

        :param data:
            The value to assign to the data property of this CreateSettingDetails.
        :type data: oci.aidataplatform_dp.models.SettingData

        """
        self.swagger_types = {
            'name': 'str',
            'is_default': 'bool',
            'data': 'SettingData'
        }

        self.attribute_map = {
            'name': 'name',
            'is_default': 'isDefault',
            'data': 'data'
        }

        self._name = None
        self._is_default = None
        self._data = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this CreateSettingDetails.
        A user-friendly name for the setting.


        :return: The name of this CreateSettingDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this CreateSettingDetails.
        A user-friendly name for the setting.


        :param name: The name of this CreateSettingDetails.
        :type: str
        """
        self._name = name

    @property
    def is_default(self):
        """
        **[Required]** Gets the is_default of this CreateSettingDetails.
        Indicates whether this setting is the default.


        :return: The is_default of this CreateSettingDetails.
        :rtype: bool
        """
        return self._is_default

    @is_default.setter
    def is_default(self, is_default):
        """
        Sets the is_default of this CreateSettingDetails.
        Indicates whether this setting is the default.


        :param is_default: The is_default of this CreateSettingDetails.
        :type: bool
        """
        self._is_default = is_default

    @property
    def data(self):
        """
        **[Required]** Gets the data of this CreateSettingDetails.

        :return: The data of this CreateSettingDetails.
        :rtype: oci.aidataplatform_dp.models.SettingData
        """
        return self._data

    @data.setter
    def data(self, data):
        """
        Sets the data of this CreateSettingDetails.

        :param data: The data of this CreateSettingDetails.
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
