# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SetModelVersionTagDetails(object):
    """
    Details of the ModelVersion tag.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SetModelVersionTagDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this SetModelVersionTagDetails.
        :type name: str

        :param version:
            The value to assign to the version property of this SetModelVersionTagDetails.
        :type version: str

        :param key:
            The value to assign to the key property of this SetModelVersionTagDetails.
        :type key: str

        :param value:
            The value to assign to the value property of this SetModelVersionTagDetails.
        :type value: str

        """
        self.swagger_types = {
            'name': 'str',
            'version': 'str',
            'key': 'str',
            'value': 'str'
        }

        self.attribute_map = {
            'name': 'name',
            'version': 'version',
            'key': 'key',
            'value': 'value'
        }

        self._name = None
        self._version = None
        self._key = None
        self._value = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this SetModelVersionTagDetails.
        Name of the registered model.


        :return: The name of this SetModelVersionTagDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this SetModelVersionTagDetails.
        Name of the registered model.


        :param name: The name of this SetModelVersionTagDetails.
        :type: str
        """
        self._name = name

    @property
    def version(self):
        """
        **[Required]** Gets the version of this SetModelVersionTagDetails.
        Model\u2019s version number.


        :return: The version of this SetModelVersionTagDetails.
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version):
        """
        Sets the version of this SetModelVersionTagDetails.
        Model\u2019s version number.


        :param version: The version of this SetModelVersionTagDetails.
        :type: str
        """
        self._version = version

    @property
    def key(self):
        """
        **[Required]** Gets the key of this SetModelVersionTagDetails.
        Tag key.


        :return: The key of this SetModelVersionTagDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this SetModelVersionTagDetails.
        Tag key.


        :param key: The key of this SetModelVersionTagDetails.
        :type: str
        """
        self._key = key

    @property
    def value(self):
        """
        **[Required]** Gets the value of this SetModelVersionTagDetails.
        Tag value.


        :return: The value of this SetModelVersionTagDetails.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """
        Sets the value of this SetModelVersionTagDetails.
        Tag value.


        :param value: The value of this SetModelVersionTagDetails.
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
