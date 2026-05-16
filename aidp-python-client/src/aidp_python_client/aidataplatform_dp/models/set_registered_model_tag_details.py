# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SetRegisteredModelTagDetails(object):
    """
    Details of the RegisteredModel tag.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SetRegisteredModelTagDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this SetRegisteredModelTagDetails.
        :type name: str

        :param key:
            The value to assign to the key property of this SetRegisteredModelTagDetails.
        :type key: str

        :param value:
            The value to assign to the value property of this SetRegisteredModelTagDetails.
        :type value: str

        """
        self.swagger_types = {
            'name': 'str',
            'key': 'str',
            'value': 'str'
        }

        self.attribute_map = {
            'name': 'name',
            'key': 'key',
            'value': 'value'
        }

        self._name = None
        self._key = None
        self._value = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this SetRegisteredModelTagDetails.
        Name of the registered model.


        :return: The name of this SetRegisteredModelTagDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this SetRegisteredModelTagDetails.
        Name of the registered model.


        :param name: The name of this SetRegisteredModelTagDetails.
        :type: str
        """
        self._name = name

    @property
    def key(self):
        """
        **[Required]** Gets the key of this SetRegisteredModelTagDetails.
        Tag key.


        :return: The key of this SetRegisteredModelTagDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this SetRegisteredModelTagDetails.
        Tag key.


        :param key: The key of this SetRegisteredModelTagDetails.
        :type: str
        """
        self._key = key

    @property
    def value(self):
        """
        **[Required]** Gets the value of this SetRegisteredModelTagDetails.
        Tag value.


        :return: The value of this SetRegisteredModelTagDetails.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """
        Sets the value of this SetRegisteredModelTagDetails.
        Tag value.


        :param value: The value of this SetRegisteredModelTagDetails.
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
