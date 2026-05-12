# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PlaygroundCache(object):
    """
    Playground cache for an Agent Flow session.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new PlaygroundCache object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param variables:
            The value to assign to the variables property of this PlaygroundCache.
        :type variables: dict(str, SessionVariable)

        """
        self.swagger_types = {
            'variables': 'dict(str, SessionVariable)'
        }

        self.attribute_map = {
            'variables': 'variables'
        }

        self._variables = None

    @property
    def variables(self):
        """
        **[Required]** Gets the variables of this PlaygroundCache.
        Map of variable name to value for this session's playground cache.


        :return: The variables of this PlaygroundCache.
        :rtype: dict(str, SessionVariable)
        """
        return self._variables

    @variables.setter
    def variables(self, variables):
        """
        Sets the variables of this PlaygroundCache.
        Map of variable name to value for this session's playground cache.


        :param variables: The variables of this PlaygroundCache.
        :type: dict(str, SessionVariable)
        """
        self._variables = variables

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
