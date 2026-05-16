# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .dependency import Dependency
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ComputeDependency(Dependency):
    """
    Compute dependency. Represents a compute cluster resource.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ComputeDependency object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.ComputeDependency.type` attribute
        of this class is ``COMPUTE`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this ComputeDependency.
            Allowed values for this property are: "FILE", "COMPUTE", "JOB"
        :type type: str

        :param key:
            The value to assign to the key property of this ComputeDependency.
        :type key: str

        """
        self.swagger_types = {
            'type': 'str',
            'key': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'key': 'key'
        }

        self._type = None
        self._key = None
        self._type = 'COMPUTE'

    @property
    def key(self):
        """
        **[Required]** Gets the key of this ComputeDependency.
        Unique identifier for compute resource.


        :return: The key of this ComputeDependency.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this ComputeDependency.
        Unique identifier for compute resource.


        :param key: The key of this ComputeDependency.
        :type: str
        """
        self._key = key

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
