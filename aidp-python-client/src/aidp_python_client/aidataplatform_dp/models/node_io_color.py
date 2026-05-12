# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class NodeIoColor(object):
    """
    Text and background color configuration for a node input/output.
    """

    #: A constant which can be used with the text_color property of a NodeIoColor.
    #: This constant has a value of "DARK"
    TEXT_COLOR_DARK = "DARK"

    #: A constant which can be used with the text_color property of a NodeIoColor.
    #: This constant has a value of "LIGHT"
    TEXT_COLOR_LIGHT = "LIGHT"

    def __init__(self, **kwargs):
        """
        Initializes a new NodeIoColor object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param text_color:
            The value to assign to the text_color property of this NodeIoColor.
            Allowed values for this property are: "DARK", "LIGHT"
        :type text_color: str

        :param background_color:
            The value to assign to the background_color property of this NodeIoColor.
        :type background_color: str

        :param handle_color:
            The value to assign to the handle_color property of this NodeIoColor.
        :type handle_color: str

        """
        self.swagger_types = {
            'text_color': 'str',
            'background_color': 'str',
            'handle_color': 'str'
        }

        self.attribute_map = {
            'text_color': 'textColor',
            'background_color': 'backgroundColor',
            'handle_color': 'handleColor'
        }

        self._text_color = None
        self._background_color = None
        self._handle_color = None

    @property
    def text_color(self):
        """
        **[Required]** Gets the text_color of this NodeIoColor.
        Whether the text on badges should be dark or light for visibility.

        Allowed values for this property are: "DARK", "LIGHT"


        :return: The text_color of this NodeIoColor.
        :rtype: str
        """
        return self._text_color

    @text_color.setter
    def text_color(self, text_color):
        """
        Sets the text_color of this NodeIoColor.
        Whether the text on badges should be dark or light for visibility.


        :param text_color: The text_color of this NodeIoColor.
        :type: str
        """
        allowed_values = ["DARK", "LIGHT"]
        if not value_allowed_none_or_none_sentinel(text_color, allowed_values):
            raise ValueError(
                "Invalid value for `text_color`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._text_color = text_color

    @property
    def background_color(self):
        """
        **[Required]** Gets the background_color of this NodeIoColor.
        Input/output badge background color.


        :return: The background_color of this NodeIoColor.
        :rtype: str
        """
        return self._background_color

    @background_color.setter
    def background_color(self, background_color):
        """
        Sets the background_color of this NodeIoColor.
        Input/output badge background color.


        :param background_color: The background_color of this NodeIoColor.
        :type: str
        """
        self._background_color = background_color

    @property
    def handle_color(self):
        """
        **[Required]** Gets the handle_color of this NodeIoColor.
        Input/output connector handle color.


        :return: The handle_color of this NodeIoColor.
        :rtype: str
        """
        return self._handle_color

    @handle_color.setter
    def handle_color(self, handle_color):
        """
        Sets the handle_color of this NodeIoColor.
        Input/output connector handle color.


        :param handle_color: The handle_color of this NodeIoColor.
        :type: str
        """
        self._handle_color = handle_color

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
