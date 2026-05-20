# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SearchObjectType(object):
    """
    Possible types of search object
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SearchObjectType object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this SearchObjectType.
        :type name: str

        :param count:
            The value to assign to the count property of this SearchObjectType.
        :type count: int

        """
        self.swagger_types = {
            'name': 'str',
            'count': 'int'
        }

        self.attribute_map = {
            'name': 'name',
            'count': 'count'
        }

        self._name = None
        self._count = None

    @property
    def name(self):
        """
        Gets the name of this SearchObjectType.
        Possible types of search object


        :return: The name of this SearchObjectType.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this SearchObjectType.
        Possible types of search object


        :param name: The name of this SearchObjectType.
        :type: str
        """
        self._name = name

    @property
    def count(self):
        """
        Gets the count of this SearchObjectType.
        Total count of search object


        :return: The count of this SearchObjectType.
        :rtype: int
        """
        return self._count

    @count.setter
    def count(self, count):
        """
        Sets the count of this SearchObjectType.
        Total count of search object


        :param count: The count of this SearchObjectType.
        :type: int
        """
        self._count = count

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
