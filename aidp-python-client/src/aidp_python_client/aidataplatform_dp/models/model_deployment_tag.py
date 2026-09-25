# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ModelDeploymentTag(object):
    """
    A tag associated with a model deployment.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ModelDeploymentTag object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this ModelDeploymentTag.
        :type key: str

        :param value:
            The value to assign to the value property of this ModelDeploymentTag.
        :type value: str

        """
        self.swagger_types = {
            'key': 'str',
            'value': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'value': 'value'
        }

        self._key = None
        self._value = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this ModelDeploymentTag.
        Key of the model deployment tag. At most 250 characters and 250 UTF-8 bytes.


        :return: The key of this ModelDeploymentTag.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this ModelDeploymentTag.
        Key of the model deployment tag. At most 250 characters and 250 UTF-8 bytes.


        :param key: The key of this ModelDeploymentTag.
        :type: str
        """
        self._key = key

    @property
    def value(self):
        """
        Gets the value of this ModelDeploymentTag.
        Value of the model deployment tag. At most 5000 characters and 5000 UTF-8 bytes.


        :return: The value of this ModelDeploymentTag.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """
        Sets the value of this ModelDeploymentTag.
        Value of the model deployment tag. At most 5000 characters and 5000 UTF-8 bytes.


        :param value: The value of this ModelDeploymentTag.
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
