# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Libraries(object):
    """
    List of libraries to be installed on the cluster.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new Libraries object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param jar:
            The value to assign to the jar property of this Libraries.
        :type jar: str

        """
        self.swagger_types = {
            'jar': 'str'
        }

        self.attribute_map = {
            'jar': 'jar'
        }

        self._jar = None

    @property
    def jar(self):
        """
        Gets the jar of this Libraries.
        URI of the jar to be installed.


        :return: The jar of this Libraries.
        :rtype: str
        """
        return self._jar

    @jar.setter
    def jar(self, jar):
        """
        Sets the jar of this Libraries.
        URI of the jar to be installed.


        :param jar: The jar of this Libraries.
        :type: str
        """
        self._jar = jar

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
