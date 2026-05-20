# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Point(object):
    """
    A 2D point for edge handles on diagram elements.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new Point object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param x:
            The value to assign to the x property of this Point.
        :type x: float

        :param y:
            The value to assign to the y property of this Point.
        :type y: float

        """
        self.swagger_types = {
            'x': 'float',
            'y': 'float'
        }

        self.attribute_map = {
            'x': 'x',
            'y': 'y'
        }

        self._x = None
        self._y = None

    @property
    def x(self):
        """
        **[Required]** Gets the x of this Point.
        X coordinate.


        :return: The x of this Point.
        :rtype: float
        """
        return self._x

    @x.setter
    def x(self, x):
        """
        Sets the x of this Point.
        X coordinate.


        :param x: The x of this Point.
        :type: float
        """
        self._x = x

    @property
    def y(self):
        """
        **[Required]** Gets the y of this Point.
        Y coordinate.


        :return: The y of this Point.
        :rtype: float
        """
        return self._y

    @y.setter
    def y(self, y):
        """
        Sets the y of this Point.
        Y coordinate.


        :param y: The y of this Point.
        :type: float
        """
        self._y = y

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
