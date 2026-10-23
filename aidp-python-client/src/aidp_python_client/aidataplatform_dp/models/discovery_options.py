# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DiscoveryOptions(object):
    """
    DiscoveryOptions model.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DiscoveryOptions object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param emit_owl:
            The value to assign to the emit_owl property of this DiscoveryOptions.
        :type emit_owl: bool

        :param emit_rml:
            The value to assign to the emit_rml property of this DiscoveryOptions.
        :type emit_rml: bool

        """
        self.swagger_types = {
            'emit_owl': 'bool',
            'emit_rml': 'bool'
        }
        self.attribute_map = {
            'emit_owl': 'emitOwl',
            'emit_rml': 'emitRml'
        }
        self._emit_owl = None
        self._emit_rml = None

    @property
    def emit_owl(self):
        """
        Gets the emit_owl of this DiscoveryOptions.

        :return: The emit_owl of this DiscoveryOptions.
        :rtype: bool
        """
        return self._emit_owl

    @emit_owl.setter
    def emit_owl(self, emit_owl):
        """
        Sets the emit_owl of this DiscoveryOptions.

        :param emit_owl: The emit_owl of this DiscoveryOptions.
        :type: bool
        """
        self._emit_owl = emit_owl

    @property
    def emit_rml(self):
        """
        Gets the emit_rml of this DiscoveryOptions.

        :return: The emit_rml of this DiscoveryOptions.
        :rtype: bool
        """
        return self._emit_rml

    @emit_rml.setter
    def emit_rml(self, emit_rml):
        """
        Sets the emit_rml of this DiscoveryOptions.

        :param emit_rml: The emit_rml of this DiscoveryOptions.
        :type: bool
        """
        self._emit_rml = emit_rml

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
